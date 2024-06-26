package com.varughese.mynewsapp.domain.usecases.news

import com.varughese.mynewsapp.data.local.NewsDao
import com.varughese.mynewsapp.domain.model.Article
import javax.inject.Inject

class UpsertArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article = article)
    }

}