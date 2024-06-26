package com.varughese.mynewsapp.presentation.filter

data class FilterUiState(
    val filterQuery: String = "",
    val selectedCategory: String? = null,
    val isFavorite: Boolean = false
)