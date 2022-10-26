package com.link.kmmpoc.domain

import com.link.kmmpoc.model.Movie
import kotlinx.coroutines.flow.Flow

interface IRepository {
    suspend fun getMovies(): List<Movie>
    fun getMovieFavorites(): Flow<List<Movie>>
    suspend fun getMovie(id: Int): Movie
    fun addMovieToFavorites(movie: Movie)
    fun removeMovieFromFavorite(idMovie: Int)
    fun isMovieFavorite(idMovie: Int): Boolean
}