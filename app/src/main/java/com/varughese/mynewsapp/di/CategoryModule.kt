package com.varughese.mynewsapp.di

import com.varughese.mynewsapp.presentation.filter.CategoryDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CategoryModule {

    @Provides
    @Singleton
    fun provideCategoryDataSource(): CategoryDataSource {
        return CategoryDataSource
    }
}