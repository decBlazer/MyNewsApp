package com.varughese.mynewsapp.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.varughese.mynewsapp.data.local.Secrets
import com.varughese.mynewsapp.data.remote.dto.NewsResponse
import com.varughese.mynewsapp.domain.model.Article
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import java.net.URLEncoder


class SearchNewsPagingSource(
    private val httpClient: HttpClient,
    private val searchQuery: String,
    private val sources: String,
) : PagingSource<Int, Article>() {

    override fun getRefreshKey(state: PagingState<Int, Article>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Article> {
        val currentPage = params.key ?: 1

        return try {
            val encodedQuery = withContext(Dispatchers.IO) {
                URLEncoder.encode(searchQuery, "UTF-8")
            }

            val baseURL = "https://newsapi.org/v2/top-headlines?q="
            val fullURL = baseURL + encodedQuery + "&apiKey=" + Secrets.NEWS_API_KEY
            val response: HttpResponse = httpClient.get(fullURL)

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
}