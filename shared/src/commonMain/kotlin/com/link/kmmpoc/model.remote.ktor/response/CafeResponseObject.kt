package com.link.kmmpoc.model.remote.ktor.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable//要注意不要import錯了

@Serializable
data class CafeResponseObject(
    val id: String, //參數的名稱即是對應的json key
    val address: String,
    val name: String,
    @SerialName("city") val cityName:String //如果json key跟參數不同，可以使用SerialName
)