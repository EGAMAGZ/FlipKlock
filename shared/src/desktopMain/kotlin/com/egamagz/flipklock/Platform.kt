package com.egamagz.flipklock

class DesktopPlatform : Platform {
    override val name: String = System.getProperty("os.name")
}

actual fun getPlatform(): Platform = DesktopPlatform()