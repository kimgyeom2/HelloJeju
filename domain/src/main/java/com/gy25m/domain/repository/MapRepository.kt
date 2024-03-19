package com.gy25m.domain.repository

import com.gy25m.domain.model.Jeju
import kotlinx.coroutines.flow.Flow

interface MapRepository  {

    suspend fun getInfo(): Flow<Jeju>


}