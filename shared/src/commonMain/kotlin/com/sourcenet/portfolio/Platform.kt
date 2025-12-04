package com.sourcenet.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform