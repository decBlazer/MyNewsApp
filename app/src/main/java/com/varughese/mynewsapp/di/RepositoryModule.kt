package com.varughese.mynewsapp.di

import com.varughese.mynewsapp.data.repository.NewsRepositoryImpl
import com.varughese.mynewsapp.domain.repository.NewsRepository
import com.varughese.mynewsapp.presentation.filter.CategoryDataSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindNewsRepository(newsRepositoryImplementation: NewsRepositoryImpl): NewsRepository
}