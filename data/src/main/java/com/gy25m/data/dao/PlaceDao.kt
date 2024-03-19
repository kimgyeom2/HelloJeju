package com.gy25m.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.gy25m.data.entity.PlaceEntity

@Dao
interface PlaceDao {
    @Insert
    fun insert(user: PlaceEntity)

}