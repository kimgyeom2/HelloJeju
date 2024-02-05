package com.gy25m.hellojeju.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "JeJuPlace")
data class PlaceEntity(
    @PrimaryKey(autoGenerate = true) val no: Int,
    val title: String,
    val address: String,
    val roadAddress:String,
    val tag:String
)
