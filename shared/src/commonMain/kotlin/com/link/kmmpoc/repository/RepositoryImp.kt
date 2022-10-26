package com.link.kmmpoc.repository

import com.link.kmmpoc.data_remote.model.ApiMovie
import com.link.kmmpoc.domain.IRepository
import com.link.kmmpoc.model.Movie
import com.link.kmmpoc.repository.model.mapper.ApiMovieMapper
import kotlinx.coroutines.flow.Flow

class RepositoryImp (
    private val cacheData: ICacheData,
    private val remoteData: IRemoteData,
    private val apiMovieMapper: ApiMovieMapper
    ) : IRepository {

        override suspend fun getMovies(): List<Movie> =
            remoteData.getMovieFromApi().results.map { apiMovieMapper.map(it) }

        override fun getMovieFavorites(): Flow<List<Movie>> =
            cacheData.getAllMovieFavorites()

        override suspend fun getMovie(id: Int): Movie =
            apiMovieMapper.map(remoteData.getMovieFromApi(id))

        override fun addMovieToFavorites(movie: Movie) =
            cacheData.addMovieToFavorite(movie)

        override fun removeMovieFromFavorite(idMovie: Int) =
            cacheData.removeMovieFromFavorite(idMovie)

        override fun isMovieFavorite(idMovie: Int): Boolean =
            cacheData.isMovieFavorite(idMovie)
    }