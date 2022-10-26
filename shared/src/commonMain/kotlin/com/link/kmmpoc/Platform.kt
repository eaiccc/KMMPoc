package com.link.kmmpoc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform