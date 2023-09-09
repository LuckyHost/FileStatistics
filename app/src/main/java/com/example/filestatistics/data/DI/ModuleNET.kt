package com.example.filestatistics.data.DI

import com.example.filestatistics.data.Net.*
import com.example.filestatistics.data.Net.Constante.BASE_URL
import com.skydoves.sandwich.adapters.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.*
import okhttp3.logging.*
import retrofit2.Retrofit
import retrofit2.converter.gson.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ModuleNET {

    @Singleton
    @Provides
    fun provideReteofit(okHttpClient: OkHttpClient): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(ApiResponseCallAdapterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideokHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
            .build()
    }

    @Singleton
    @Provides
    fun provideAPIService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}