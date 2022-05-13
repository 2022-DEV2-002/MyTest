package com.berlin.clock.controller.utils

import com.berlin.clock.model.LampColor
import org.junit.Assert
import org.junit.Test

/**
 * Test Minutes
 *
 */
class LampColorGeneratorMinutesUnitTest {

    @Test
    fun `test all minutes are white`() {
        val minuet = 0
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveMinutesLamps(minuet)
        val oneMinuteLampsResult = LampColorGenerator.generateOneMinuteLamps(minuet)

        val fiveMinutesLampsExpected = Array(11){ _-> LampColor.WHITE}
        val oneMinuteLampsExpected = Array(4){ _-> LampColor.WHITE}

        Assert.assertArrayEquals(fiveMinutesLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneMinuteLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 01 minutes`() {
        val minuet = 1
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveMinutesLamps(minuet)
        val oneMinuteLampsResult = LampColorGenerator.generateOneMinuteLamps(minuet)

        val fiveMinutesLampsExpected = Array(11) { _ -> LampColor.WHITE }
        val oneMinuteLampsExpected = Array(4) { _ -> LampColor.WHITE }
        oneMinuteLampsExpected[0] = LampColor.YELLOW

        Assert.assertArrayEquals(fiveMinutesLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneMinuteLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 11 minutes`() {
        val minuet = 11
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveMinutesLamps(minuet)
        val oneMinuteLampsResult = LampColorGenerator.generateOneMinuteLamps(minuet)

        val fiveMinutesLampsExpected = Array(11) { _ -> LampColor.WHITE }
        fiveMinutesLampsExpected[0] = LampColor.YELLOW
        fiveMinutesLampsExpected[1] = LampColor.YELLOW

        val oneMinuteLampsExpected = Array(4) { _ -> LampColor.WHITE }
        oneMinuteLampsExpected[0] = LampColor.YELLOW

        Assert.assertArrayEquals(fiveMinutesLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneMinuteLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 20 minutes`() {
        val minuet = 20
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveMinutesLamps(minuet)
        val oneMinuteLampsResult = LampColorGenerator.generateOneMinuteLamps(minuet)

        val fiveMinutesLampsExpected = Array(11) { _ -> LampColor.WHITE }
        fiveMinutesLampsExpected[0] = LampColor.YELLOW
        fiveMinutesLampsExpected[1] = LampColor.YELLOW
        fiveMinutesLampsExpected[2] = LampColor.RED
        fiveMinutesLampsExpected[3] = LampColor.YELLOW

        val oneMinuteLampsExpected = Array(4) { _ -> LampColor.WHITE }

        Assert.assertArrayEquals(fiveMinutesLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneMinuteLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 39 minutes`() {
        val minuet = 39
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveMinutesLamps(minuet)
        val oneMinuteLampsResult = LampColorGenerator.generateOneMinuteLamps(minuet)

        val fiveMinutesLampsExpected = Array(11) { _ -> LampColor.WHITE }
        for (i:Int in 0..6)
        fiveMinutesLampsExpected[i] = LampColor.YELLOW

        fiveMinutesLampsExpected[2] = LampColor.RED
        fiveMinutesLampsExpected[5] = LampColor.RED

        val oneMinuteLampsExpected = Array(4) { _ -> LampColor.YELLOW }

        Assert.assertArrayEquals(fiveMinutesLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneMinuteLampsExpected, oneMinuteLampsResult)
    }

    @Test
    fun `test 53 minutes`() {
        val minuet = 53
        val fiveMinutesLampsResult = LampColorGenerator.generateFiveMinutesLamps(minuet)
        val oneMinuteLampsResult = LampColorGenerator.generateOneMinuteLamps(minuet)

        val fiveMinutesLampsExpected = Array(11) { _ -> LampColor.WHITE }
        for (i:Int in 0..9)
            fiveMinutesLampsExpected[i] = LampColor.YELLOW

        fiveMinutesLampsExpected[2] = LampColor.RED
        fiveMinutesLampsExpected[5] = LampColor.RED
        fiveMinutesLampsExpected[7] = LampColor.RED
        fiveMinutesLampsExpected[9] = LampColor.RED

        val oneMinuteLampsExpected = Array(4) { _ -> LampColor.YELLOW }
        oneMinuteLampsExpected[3] = LampColor.WHITE

        Assert.assertArrayEquals(fiveMinutesLampsExpected, fiveMinutesLampsResult)
        Assert.assertArrayEquals(oneMinuteLampsExpected, oneMinuteLampsResult)
    }
}