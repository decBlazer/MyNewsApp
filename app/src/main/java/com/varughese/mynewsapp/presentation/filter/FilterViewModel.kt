package com.varughese.mynewsapp.presentation.filter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.DataSource
import androidx.paging.PagingData
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.domain.repository.NewsRepository
import com.varughese.mynewsapp.domain.usecases.news.GetNewsByCategory
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource.selectedCategory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@HiltViewModel
class FilterViewModel @Inject constructor(
    private val getNewsByCategory: GetNewsByCategory,
    private val categoryDataSource: CategoryDataSource
) : ViewModel() {

    val filteredArticles: Flow<PagingData<Article>> = categoryDataSource.selectedCategory
        .flatMapLatest { category ->
            getNewsByCategory(category)
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(), PagingData.empty())

    fun updateCategory(category: String) {
        categoryDataSource.updateCategory(category)
    }
}