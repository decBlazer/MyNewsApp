package com.varughese.mynewsapp.di

import com.varughese.mynewsapp.data.manager.LocalUserManagerImplementation
import com.varughese.mynewsapp.domain.manager.LocalUserManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ManagerModule {

    @Binds
    @Singleton
    abstract fun bindLocalUserManager(localUserManagerImplementation: LocalUserManagerImplementation) : LocalUserManager
}