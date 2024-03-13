package com.gy25m.hellojeju.repository

import com.gy25m.hellojeju.model.Jeju
import kotlinx.coroutines.flow.Flow

interface MapRepository  {

    suspend fun getInfo(): Flow<Jeju>


}