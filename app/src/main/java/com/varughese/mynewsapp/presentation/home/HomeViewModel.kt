package com.varughese.mynewsapp.presentation.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.domain.usecases.news.GetNews
import com.varughese.mynewsapp.domain.usecases.news.GetNewsByCategory
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource
import com.varughese.mynewsapp.presentation.filter.FilterViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.util.logging.Filter
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getNewsUseCase: GetNews,
    private val categoryDataSource: CategoryDataSource,
    private val getNewsByCategory: GetNewsByCategory
) : ViewModel() {

    private val _articles: StateFlow<PagingData<Article>>? = null

    val articles: StateFlow<PagingData<Article>>? get() = _articles

    private var defaultSources = listOf("bbc-news", "abc-news", "al-jazeera-english")
    private var sportsSources = listOf("espn", "bleacher-report")
    var state = mutableStateOf(HomeState())
        private set

    var news = getNewsUseCase(
        sources = switchNews()
    ).cachedIn(viewModelScope)
        private set

    private var count = 0
    fun switchNews(): List<String> {
        val sourcesToUse = if (count % 2 == 0) defaultSources else sportsSources
        news = getNewsUseCase(sources = sourcesToUse).cachedIn(viewModelScope)
        count++
        return sourcesToUse
    }
}