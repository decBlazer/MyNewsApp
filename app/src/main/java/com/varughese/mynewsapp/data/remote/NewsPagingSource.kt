package com.varughese.mynewsapp.data.remote

import android.nfc.tech.MifareUltralight.PAGE_SIZE
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.varughese.mynewsapp.data.local.Secrets
import com.varughese.mynewsapp.data.remote.dto.NewsResponse
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource.selectedCategory
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import java.net.URLEncoder

class NewsPagingSource(
    private val httpClient: HttpClient,
    private val sources: String,
    private val categoryDataSource: CategoryDataSource
) : PagingSource<Int, Article>() {

    private var totalNewsCount = 0
    private lateinit var response: HttpResponse

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Article> {
        return try {
            val currentPage = params.key ?: 1
            if (selectedCategory.value.equals("") || selectedCategory.value.equals("No Filter")) {
                response =
                    httpClient.get("https://newsapi.org/v2/top-headlines?country=us&apiKey=" + Secrets.NEWS_API_KEY) {
                    }
                if (response.status.isSuccess()) {
                    println("Success")
                    val newsResponse: NewsResponse = response.body()
                    val articles = newsResponse.articles.distinctBy { it.title }
                    val totalResults = newsResponse.totalResults

                    LoadResult.Page(
                        data = articles,
                        prevKey = if (currentPage == 1) null else currentPage - 1,
                        nextKey = if (articles.isEmpty() || totalResults <= currentPage * PAGE_SIZE) null else currentPage + 1
                    )
                } else {
                    println("Failure")
                    LoadResult.Error(IOException("Error response ${response.status}: ${response.bodyAsText()}"))
                }
            } else {
                return try {
                    val encodedQuery = withContext(Dispatchers.IO) {
                        URLEncoder.encode(selectedCategory.value, "UTF-8")
                    }

                    val baseURL = "https://newsapi.org/v2/top-headlines?q="
                    val fullURL = baseURL + encodedQuery + "&apiKey=" + Secrets.NEWS_API_KEY
                    response = httpClient.get(fullURL)

                    if (response.status.isSuccess()) {
                        val jsonString = response.bodyAsText()
                        val newsResponse = Json.decodeFromString<NewsResponse>(jsonString)
                        val articles = newsResponse.articles

                        val nextPage = if (articles.isNotEmpty()) currentPage + 1 else null

                        LoadResult.Page(
                            data = articles,
                            prevKey = if (currentPage == 1) null else currentPage - 1,
                            nextKey = nextPage
                        )
                    } else {
                        LoadResult.Error(Exception("HTTP Error: ${response.status}"))
                    }
                } catch (e: Exception) {
                    LoadResult.Error(e)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Article>): Int? {
        // You can implement a more sophisticated refresh key logic if needed
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}

