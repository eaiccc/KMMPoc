package com.link.kmmpoc.domain.interactors

import com.link.kmmpoc.domain.IRepository
import com.link.kmmpoc.domain.interactors.type.UseCaseOut
import com.link.kmmpoc.model.Movie

class GetＭoviesUseCase(
    private val repository: IRepository,
    override val block: suspend () -> List<Movie> = { repository.getMovies() },
) : UseCaseOut<List<Movie>>()
