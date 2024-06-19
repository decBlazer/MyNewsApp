package com.loc.newsapp.domain.usecases.news

import com.varughese.mynewsapp.domain.usecases.news.DeleteArticle

data class NewsUseCases(
    val getNews: GetNews,
    val searchNews: SearchNews,
    val upsertArticle: UpsertArticle,
    val deleteArticle: DeleteArticle,
    val selectArticles: SelectArticles
)