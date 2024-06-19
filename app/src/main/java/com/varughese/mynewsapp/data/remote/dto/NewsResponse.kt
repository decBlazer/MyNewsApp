package com.varughese.mynewsapp.data.remote.dto

import com.varughese.mynewsapp.domain.model.Article
import kotlinx.serialization.Serializable

@Serializable
data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)