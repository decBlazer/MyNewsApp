package com.varughese.mynewsapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.varughese.mynewsapp.domain.model.Article
import com.varughese.mynewsapp.data.local.NewsDao

@Database(entities = [Article::class],version = 1)
@TypeConverters(NewsTypeConvertor::class)
abstract class NewsDatabase : RoomDatabase() {

    abstract val newsDao: NewsDao

}