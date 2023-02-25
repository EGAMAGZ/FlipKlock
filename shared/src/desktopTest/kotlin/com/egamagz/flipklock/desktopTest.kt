package com.egamagz.flipklock

import kotlin.test.Test
import kotlin.test.assertTrue

class DesktopGreetingTest {
    @Test
    fun testExample() {
        val osName = System.getProperty("os.name")
        assertTrue(Greeting().greet().contains(osName), "Check 'Hello' is mentioned")
    }
}