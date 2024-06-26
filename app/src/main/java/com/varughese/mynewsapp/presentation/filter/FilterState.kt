package com.varughese.mynewsapp.presentation.filter


data class FilterState(
    val newsTicker: String = "",
    val isLoading: Boolean = false,
)