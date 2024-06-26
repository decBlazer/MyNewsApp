package com.varughese.mynewsapp.presentation.filter

import dagger.Provides
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

object CategoryDataSource {
    private var _selectedCategory = MutableStateFlow("")

    val selectedCategory: StateFlow<String> get() = _selectedCategory

    fun updateCategory(category: String) {
        _selectedCategory.value = category
    }
}