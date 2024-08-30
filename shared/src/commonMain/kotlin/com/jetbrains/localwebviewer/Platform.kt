package com.jetbrains.localwebviewer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform