package com.varughese.mynewsapp.presentation.bookmark

import com.varughese.mynewsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)