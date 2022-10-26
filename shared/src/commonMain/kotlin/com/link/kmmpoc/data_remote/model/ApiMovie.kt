package com.link.kmmpoc.data_remote.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiMovieResponse(
    val results: List<ApiMovie>
)

@Serializable
data class ApiMovie(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val gender: String,
    val image: String
)


