package com.example.filestatistics.present

import android.content.ClipData.Item
import androidx.lifecycle.ViewModel
import com.example.filestatistics.domian.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import retrofit2.http.Path
import javax.inject.Inject

@HiltViewModel
class MyViewModel  @Inject constructor(
    private val repository: Repository
):ViewModel() {

    private val _isLoadFile = MutableStateFlow(false)
    val isLoadFile = _isLoadFile.asStateFlow()

    private val _listPerson = MutableStateFlow<List<com.example.filestatistics.domian.Room.DataClass.Item>>(emptyList())
    val listPerson = _listPerson.asStateFlow()


    suspend fun getDataYandexFile(path: String,limit:String){
        repository.getDataFile(path  , limit  ) {_listPerson.value = it  }
        
        listPerson.value.forEach { android.util.Log.d("MyLog","MyViewModel.kt. getDataYandexFile: ${it.name}") }
    }
}