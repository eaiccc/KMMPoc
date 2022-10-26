package com.link.kmmpoc.di

import com.link.kmmpoc.domain.MainDispatcher
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    //single { DatabaseDriverFactory(get()) }
    single { MainDispatcher() }
}