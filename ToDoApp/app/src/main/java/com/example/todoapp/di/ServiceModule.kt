package com.example.todoapp.di

import com.example.todoapp.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)

object ServiceModule {
    @Singleton
    @Provides

    fun returnRepository() : Repository{
        return Repository()
    }
}