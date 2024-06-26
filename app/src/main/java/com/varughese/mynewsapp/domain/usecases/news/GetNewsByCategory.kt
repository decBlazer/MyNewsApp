package com.varughese.mynewsapp.domain.usecases.news

import androidx.paging.PagingData
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.domain.repository.NewsRepository
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNewsByCategory @Inject constructor(
    private val newsRepository: NewsRepository,
    private val categoryDataSource: CategoryDataSource
) {
    suspend operator fun invoke(category: String): Flow<PagingData<Article>> {
        return newsRepository.getNewsByCategory(categoryDataSource.selectedCategory.value)
    }
}