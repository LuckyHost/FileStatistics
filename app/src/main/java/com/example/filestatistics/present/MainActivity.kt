package com.example.filestatistics.present

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myViewModel by viewModels<MyViewModel>()

        CoroutineScope(Dispatchers.IO).launch {
        myViewModel.getDataYandexFile("Работа/Рац Смета/UserName","10")
        }

        setContent {
        }

    }
}

