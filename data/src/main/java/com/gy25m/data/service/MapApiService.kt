package com.gy25m.data.service

import com.gy25m.domain.model.Jeju
import retrofit2.http.GET
import retrofit2.http.Query

interface MapApiService {
    @GET("vsjApi/contents/searchList")
   suspend fun getJeJuInfo( @Query("apiKey") apiKey: String,@Query("locale") locale: String,@Query("category") category: String): Jeju
}