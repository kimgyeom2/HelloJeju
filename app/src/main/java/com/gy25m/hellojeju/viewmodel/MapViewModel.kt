package com.gy25m.hellojeju.viewmodel

import androidx.lifecycle.ViewModel
import com.gy25m.hellojeju.usecase.MapUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(private val mapUseCase: MapUseCase):ViewModel() {
}