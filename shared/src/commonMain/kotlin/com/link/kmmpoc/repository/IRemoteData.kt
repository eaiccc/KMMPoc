package com.link.kmmpoc.repository

import com.link.kmmpoc.data_remote.model.ApiMovie
import com.link.kmmpoc.data_remote.model.ApiMovieResponse

interface IRemoteData {
    suspend fun getMovieFromApi(): ApiMovieResponse
    suspend fun getMovieFromApi(id: Int): ApiMovie
}