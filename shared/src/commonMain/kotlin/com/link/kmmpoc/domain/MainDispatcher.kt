package com.link.kmmpoc.domain

import kotlinx.coroutines.CoroutineDispatcher

expect class MainDispatcher() {
    val dispatcher: CoroutineDispatcher
}