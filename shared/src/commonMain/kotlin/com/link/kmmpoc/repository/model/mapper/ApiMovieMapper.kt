package com.link.kmmpoc.repository.model.mapper

import com.link.kmmpoc.data_remote.model.ApiMovie
import com.link.kmmpoc.model.Movie
import com.link.kmmpoc.model.map.Mapper

class ApiMovieMapper : Mapper<ApiMovie, Movie>() {
    override fun map(model: ApiMovie): Movie = model.run {
        Movie(

        )
    }

    override fun inverseMap(model: Movie): ApiMovie {
        TODO("Not yet implemented")
    }
}