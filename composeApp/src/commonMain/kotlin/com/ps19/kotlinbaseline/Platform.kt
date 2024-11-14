package com.ps19.kotlinbaseline

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform