package com.egamagz.flipklock

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform