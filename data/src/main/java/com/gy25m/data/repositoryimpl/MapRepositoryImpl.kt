package com.gy25m.data.repositoryimpl

import com.gy25m.data.database.AppDatabase
import com.gy25m.domain.repository.MapRepository
import com.gy25m.data.service.MapApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MapRepositoryImpl @Inject constructor(
    private val apiService: MapApiService,
    private val database: AppDatabase
): MapRepository {
    override suspend fun getInfo()= flow {
        emit(apiService.getJeJuInfo("rtx2xxs6v1kepxlb","kr","c3"))
    }



}