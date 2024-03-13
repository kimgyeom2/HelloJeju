package com.gy25m.hellojeju.ui.map.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gy25m.hellojeju.usecase.MapUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.Flow

@HiltViewModel
class MapViewModel @Inject constructor(private val mapUseCase: MapUseCase):ViewModel() {

    fun aa(){
        viewModelScope.launch {
             mapUseCase.bb().collect{
                it.items.map {p->
                    Log.i("xxx",p.title)
                }
             }
        }
    }

}