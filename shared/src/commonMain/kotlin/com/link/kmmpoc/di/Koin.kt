package com.link.kmmpoc.di

import com.link.kmmpoc.data_remote.RemoteDataImp
import com.link.kmmpoc.domain.IRepository
import com.link.kmmpoc.repository.ICacheData
import com.link.kmmpoc.repository.IRemoteData
import com.link.kmmpoc.repository.RepositoryImp
import com.link.kmmpoc.repository.model.mapper.ApiMovieMapper
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            repositoryModule,
            mapperModule,
            dispatcherModule,
            useCasesModule,
            platformModule()
        )
    }

// IOS
fun initKoin() = initKoin {}

val repositoryModule = module {
    single<IRepository> { RepositoryImp(get(), get(), get()) }
    //single<ICacheData> { CacheDataImp(get()) }
    single<IRemoteData> { RemoteDataImp(get(), get()) }

    single {
        HttpClient {
            install(JsonFeature) {
                val json = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }
                serializer = KotlinxSerializer(json)
            }
        }
    }

    single { "https://rickandmortyapi.com/" }
}

val useCasesModule: Module = module {

}

val dispatcherModule = module {
    factory { Dispatchers.Default }
}

val mapperModule = module {
    factory { ApiMovieMapper() }
}