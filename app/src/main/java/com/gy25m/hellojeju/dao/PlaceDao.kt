package com.gy25m.hellojeju.dao

import androidx.room.Dao
import androidx.room.Insert
import com.gy25m.hellojeju.entity.PlaceEntity

@Dao
interface PlaceDao {
    @Insert
    fun insert(user: PlaceEntity)

}