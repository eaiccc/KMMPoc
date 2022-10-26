package com.link.kmmpoc.repository

import com.link.kmmpoc.model.Movie
import kotlinx.coroutines.flow.Flow

interface ICacheData {
    fun addMovieToFavorite(movie: Movie)
    fun removeMovieFromFavorite(idMovie: Int)
    fun getAllMovieFavorites(): Flow<List<Movie>>
    fun isMovieFavorite(idMovie: Int): Boolean
}