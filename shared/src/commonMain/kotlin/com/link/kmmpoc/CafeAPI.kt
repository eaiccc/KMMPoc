package com.link.kmmpoc
import com.link.kmmpoc.model.remote.ktor.response.CafeResponseObject

interface CafeAPI {
    suspend fun fetchCafeFromApi(city:String): List<CafeResponseObject>
}