package com.varughese.mynewsapp.domain.usecases.news

import com.varughese.mynewsapp.data.local.NewsDao
import com.varughese.mynewsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticles (
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>> {
        return newsDao.getArticles()
    }
}