package com.egamagz.flipklock

import kotlin.test.Test
import kotlin.test.assertTrue

class DesktopGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greet().contains("Desktop"), "Check 'Hello' is mentioned")
    }
}