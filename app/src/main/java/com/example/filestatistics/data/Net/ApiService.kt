package com.example.filestatistics.data.Net

import com.example.filestatistics.domian.Room.DataClass.*
import com.skydoves.sandwich.*
import retrofit2.*
import retrofit2.http.*

interface ApiService {

    @Headers("Accept: application/json")
    @GET("v1/disk/resources")
    suspend fun getDataYandexFile(
        @Header("Authorization") authToken: String,
        @Query("path") path: String,
        @Query("limit") limit: String,
        @Query("sort") sort: String
    ): ApiResponse<YandexFile>

    @DELETE()
    suspend fun deleteYandexFile(
        @Header("Authorization") authToken: String,
        @Url path: String
    ): ApiResponse<YandexFile>

}
