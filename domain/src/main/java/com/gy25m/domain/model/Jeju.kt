package com.gy25m.domain.model

data class Jeju(
    val result:String,
    val resultMessage:String,
    val totalCount:Int,
    val resultCount:Int,
    val pageSize:Int,
    val pageCount:Int,
    val currentPage:Int,
    val items:List<JejuIntem>,
)

data class JejuIntem(
    val alltag:String,
    val contentsid:String,
    val title:String,
    val address:String,
    val roadaddress:String,
    val tag:String,
    val introduction:String,
)
