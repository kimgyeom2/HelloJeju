package com.gy25m.hellojeju.repositoryimpl

import com.gy25m.hellojeju.database.AppDatabase
import com.gy25m.hellojeju.model.Jeju
import com.gy25m.hellojeju.repository.MapRepository
import com.gy25m.hellojeju.service.MapApiService
import javax.inject.Inject

class MapRepositoryImpl @Inject constructor(
    private val apiService: MapApiService,
    private val database: AppDatabase
): MapRepository {
    override suspend fun getInfo(): Jeju = apiService.getJeJuInfo("rtx2xxs6v1kepxlb","kr","c3")



}