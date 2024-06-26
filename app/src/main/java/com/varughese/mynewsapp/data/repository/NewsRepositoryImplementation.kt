package com.varughese.mynewsapp.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.varughese.mynewsapp.data.local.NewsDao
import com.varughese.mynewsapp.data.remote.NewsPagingSource
import com.varughese.mynewsapp.data.remote.SearchNewsPagingSource
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.domain.repository.NewsRepository
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource
import io.ktor.client.HttpClient
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val httpClient: HttpClient,
    private val newsDao: NewsDao,
    private val categoryDataSource: CategoryDataSource
) : NewsRepository {

    override fun getNews(sources: List<String>): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                NewsPagingSource(httpClient = httpClient, sources = sources.toString(), categoryDataSource)
            }
        ).flow
    }

    override suspend fun getNewsByCategory(sources: String): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                NewsPagingSource(httpClient = httpClient, sources = sources, categoryDataSource)
            }
        ).flow
    }

    override fun searchNews(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                SearchNewsPagingSource(
                    httpClient = httpClient,
                    searchQuery = searchQuery,
                    sources = sources.toString(),
                )
            }
        ).flow
    }

    override suspend fun upsertArticle(article: Article) {
        newsDao.upsert(article)
    }

    override suspend fun deleteArticle(article: Article) {
        newsDao.delete(article)
    }

    override fun getArticles(): Flow<List<Article>> {
        return newsDao.getArticles()
    }

    override suspend fun getArticle(url: String): Article? {
        return newsDao.getArticle(url = url)
    }
}