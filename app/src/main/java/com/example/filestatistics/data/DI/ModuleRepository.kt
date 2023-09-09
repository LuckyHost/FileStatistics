package com.example.filestatistics.data.DI

import com.example.filestatistics.domian.*
import dagger.Module
import dagger.Provides
import dagger.hilt.*
import dagger.hilt.components.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ModuleRepository {

  /*  @Singleton
    @Provides
    fun provideRepository(repository: Repository):Repository{
        return repository
    }*/
}