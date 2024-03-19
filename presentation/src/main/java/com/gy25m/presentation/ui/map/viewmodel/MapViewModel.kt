package com.gy25m.hellojeju.ui.map.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gy25m.domain.usecase.MapUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(private val mapUseCase: MapUseCase):ViewModel() {

    fun aa(){
        //데이터 처리만 하는거면 viewModelScope, 지속적인 UI업데이트가 필요하다면 lifecycleScope
        viewModelScope.launch {
             mapUseCase.bb().collect{
                it.items.map {result->
                    Log.i("TAG",result.title)
                }
             }
        }
    }

}