package com.example.filestatistics.present

import androidx.lifecycle.ViewModel
import com.example.filestatistics.domian.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class MyViewModel  @Inject constructor(
    private val repository: Repository
):ViewModel() {

    private val _isLoadFile = MutableStateFlow(false)
    val isLoadFile = _isLoadFile.asStateFlow()
}