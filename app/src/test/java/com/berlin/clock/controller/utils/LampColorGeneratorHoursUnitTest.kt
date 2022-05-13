package com.berlin.clock.controller.utils

import com.berlin.clock.model.LampColor
import org.junit.Assert
import org.junit.Test

/**
 * Test Hours
 *
 */
class LampColorGeneratorHoursUnitTest {
    @Test
    fun `test all hours are white`() {
        val hours = 0
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveHoursLamps(hours)
        val oneMinuteLampsResult = LampColorGenerator.generateOneHourLamps(hours)

        val fiveHoursLampsExpected = Array(4){ _-> LampColor.WHITE}
        val oneHourLampsExpected = Array(4){ _-> LampColor.WHITE}

        Assert.assertArrayEquals(fiveHoursLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneHourLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 01 hours`() {
        val hours = 1
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveHoursLamps(hours)
        val oneMinuteLampsResult = LampColorGenerator.generateOneHourLamps(hours)

        val fiveHoursLampsExpected = Array(4){ _-> LampColor.WHITE}
        val oneHourLampsExpected = Array(4){ _-> LampColor.WHITE}
        oneHourLampsExpected[0] = LampColor.RED

        Assert.assertArrayEquals(fiveHoursLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneHourLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 11 hours`() {
        val hours = 11
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveHoursLamps(hours)
        val oneMinuteLampsResult = LampColorGenerator.generateOneHourLamps(hours)

        val fiveHoursLampsExpected = Array(4){ _-> LampColor.WHITE}
        fiveHoursLampsExpected[0] = LampColor.RED
        fiveHoursLampsExpected[1] = LampColor.RED

        val oneHourLampsExpected = Array(4){ _-> LampColor.WHITE}
        oneHourLampsExpected[0] = LampColor.RED

        Assert.assertArrayEquals(fiveHoursLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneHourLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 17 hours`() {
        val hours = 17
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveHoursLamps(hours)
        val oneMinuteLampsResult = LampColorGenerator.generateOneHourLamps(hours)

        val fiveHoursLampsExpected = Array(4){ _-> LampColor.WHITE}
        fiveHoursLampsExpected[0] = LampColor.RED
        fiveHoursLampsExpected[1] = LampColor.RED
        fiveHoursLampsExpected[2] = LampColor.RED

        val oneHourLampsExpected = Array(4){ _-> LampColor.WHITE}
        oneHourLampsExpected[0] = LampColor.RED
        oneHourLampsExpected[1] = LampColor.RED

        Assert.assertArrayEquals(fiveHoursLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneHourLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 23 hours`() {
        val hours = 23
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveHoursLamps(hours)
        val oneMinuteLampsResult = LampColorGenerator.generateOneHourLamps(hours)

        val fiveHoursLampsExpected = Array(4){ _-> LampColor.RED}

        val oneHourLampsExpected = Array(4){ _-> LampColor.RED}
        oneHourLampsExpected[3] = LampColor.WHITE

        Assert.assertArrayEquals(fiveHoursLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneHourLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 14 hours`() {
        val hours = 14
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveHoursLamps(hours)
        val oneMinuteLampsResult = LampColorGenerator.generateOneHourLamps(hours)

        val fiveHoursLampsExpected = Array(4){ _-> LampColor.WHITE}
        fiveHoursLampsExpected[0] = LampColor.RED
        fiveHoursLampsExpected[1] = LampColor.RED

        val oneHourLampsExpected = Array(4){ _-> LampColor.RED}

        Assert.assertArrayEquals(fiveHoursLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneHourLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 9 hours`() {
        val hours = 9
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveHoursLamps(hours)
        val oneMinuteLampsResult = LampColorGenerator.generateOneHourLamps(hours)

        val fiveHoursLampsExpected = Array(4){ _-> LampColor.WHITE}
        fiveHoursLampsExpected[0] = LampColor.RED
        val oneHourLampsExpected = Array(4){ _-> LampColor.RED}

        Assert.assertArrayEquals(fiveHoursLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneHourLampsExpected, oneMinuteLampsResult)
    }
}