package com.link.kmmpoc.data_remote

import com.link.kmmpoc.data_remote.model.ApiMovie
import com.link.kmmpoc.data_remote.model.ApiMovieResponse
import com.link.kmmpoc.repository.IRemoteData
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*

class RemoteDataImp(
    private val endPoint: String,
    private val httpClient: HttpClient
) : IRemoteData {
    override suspend fun getMovieFromApi(): ApiMovieResponse =
        httpClient.get { apiUrl("/api/character") }

    override suspend fun getMovieFromApi(id: Int): ApiMovie =
        httpClient.get { apiUrl("/api/character/$id") }

    private fun HttpRequestBuilder.apiUrl(path: String) {
        url {
            takeFrom(endPoint)
            encodedPath = path
        }
    }
}