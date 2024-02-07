package com.gy25m.hellojeju.repository

import com.gy25m.hellojeju.model.Jeju

interface MapRepository  {

    suspend fun getInfo():Jeju


}