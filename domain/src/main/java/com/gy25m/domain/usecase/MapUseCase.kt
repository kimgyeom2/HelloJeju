package com.gy25m.domain.usecase

import com.gy25m.domain.repository.MapRepository
import javax.inject.Inject

class MapUseCase @Inject constructor(private  val mapRepository: MapRepository) {
    suspend fun bb()=mapRepository.getInfo()


}