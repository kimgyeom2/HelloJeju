package com.gy25m.hellojeju.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gy25m.hellojeju.dao.PlaceDao
import com.gy25m.hellojeju.entity.PlaceEntity

@Database(entities = [PlaceEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun PlaceDao(): PlaceDao
}