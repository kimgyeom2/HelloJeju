package com.gy25m.hellojeju.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gy25m.hellojeju.usecase.MapUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(private val mapUseCase: MapUseCase):ViewModel() {

    fun aa(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){ var aa=mapUseCase.bb()
            Log.i("gyeom",aa.toString())}}
    }

}