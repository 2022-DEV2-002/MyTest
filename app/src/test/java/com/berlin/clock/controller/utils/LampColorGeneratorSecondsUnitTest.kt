package com.berlin.clock.controller.utils

import com.berlin.clock.model.LampColor
import org.junit.Test
import org.junit.Assert.*

/**
 * Test Seconds
 *
 */
class LampColorGeneratorSecondsUnitTest {
    @Test
    fun `test seconds red lamp`() {
        val secondsResult = LampColorGenerator.generateSecondsLamp(0)
        assertEquals(LampColor.RED, secondsResult)
    }

    @Test
    fun `test seconds white lamp`() {
        val secondsResult = LampColorGenerator.generateSecondsLamp(1)
        assertEquals(LampColor.WHITE, secondsResult)
    }

    @Test
    fun `test 59 seconds`() {
        val secondsResult = LampColorGenerator.generateSecondsLamp(59)
        assertEquals(LampColor.WHITE, secondsResult)
    }
}