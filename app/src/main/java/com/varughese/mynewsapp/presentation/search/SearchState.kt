package com.varughese.mynewsapp.presentation.search

import androidx.paging.PagingData
import com.varughese.mynewsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)