package com.example.filestatistics.domian

import android.util.*
import com.example.filestatistics.data.Net.*
import com.example.filestatistics.data.Net.Constante.token
import com.example.filestatistics.domian.Room.DataClass.*
import com.skydoves.sandwich.*
import javax.inject.*

class Repository @Inject constructor(
    private val apiService: ApiService,
    )
{
    suspend fun getDataFile(path:String,limit:String,success: (List<Item>) -> Unit) {

        val response = apiService.getDataYandexFile(token, path,limit,"-created")
        response.suspendOnSuccess { success(data._embedded.items) }
            .suspendOnError { Log.d("MyLog", "Repository.kt. getDataFile: ${message()} ") }
            .suspendOnException {Log.d("MyLog","Repository.kt. getDataFile:$message ")}
    }

  }