package com.berlin.clock.controller

import com.berlin.clock.model.ClockLamps
import com.berlin.clock.model.LampColor
import org.junit.Test
import org.junit.Assert.*

/**
 * Test all lamps
 *
 */
class BerlinClockControllerUnitTest{
    @Test
    fun `test all white lamps only seconds is illuminated`() {
        val clockResult = BerlinClockController(0,0,0).getBerlinClockLamps()
        val clockExpected = ClockLamps()
        assertEquals(clockExpected, clockResult)
    }

    @Test
    fun `test all lamps are white`() {
        val clockResult = BerlinClockController(0,0,1).getBerlinClockLamps()
        val clockExpected = ClockLamps(secondsLamp = LampColor.WHITE)
        assertEquals(clockExpected, clockResult)
    }

    @Test
    fun `test clock 11_37_12`() {
        val clockResult = BerlinClockController(13,37,12).getBerlinClockLamps()

        val fiveHoursLamps: Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        fiveHoursLamps[0]=LampColor.RED
        fiveHoursLamps[1]=LampColor.RED
        val oneHourLamps: Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        oneHourLamps[0]=LampColor.RED
        oneHourLamps[1]=LampColor.RED
        oneHourLamps[2]=LampColor.RED
        val fiveMinutesLamps: Array<LampColor> = Array(11){ _-> LampColor.WHITE}
        for (i:Int in 0..6)
            fiveMinutesLamps[i] = LampColor.YELLOW

            fiveMinutesLamps[2] = LampColor.RED
            fiveMinutesLamps[5] = LampColor.RED
        val oneMinutesLamps: Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        oneMinutesLamps[0]=LampColor.YELLOW
        oneMinutesLamps[1]=LampColor.YELLOW

        val clockExpected = ClockLamps(
            secondsLamp = LampColor.RED,
            fiveHoursLamps = fiveHoursLamps,
            oneHourLamps = oneHourLamps,
            fiveMinutesLamps = fiveMinutesLamps,
            oneMinutesLamps = oneMinutesLamps
        )
        assertEquals(clockExpected, clockResult)
    }

    @Test
    fun `test clock 06_59_36`() {
        val clockResult = BerlinClockController(6,59,36).getBerlinClockLamps()

        val fiveHoursLamps: Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        fiveHoursLamps[0]=LampColor.RED
        val oneHourLamps: Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        oneHourLamps[0]=LampColor.RED
        val fiveMinutesLamps: Array<LampColor> = Array(11){ _-> LampColor.YELLOW}
        fiveMinutesLamps[2] = LampColor.RED
        fiveMinutesLamps[5] = LampColor.RED
        fiveMinutesLamps[8] = LampColor.RED
        val oneMinutesLamps: Array<LampColor> = Array(4){ _-> LampColor.YELLOW}

        val clockExpected = ClockLamps(
            secondsLamp = LampColor.RED,
            fiveHoursLamps = fiveHoursLamps,
            oneHourLamps = oneHourLamps,
            fiveMinutesLamps = fiveMinutesLamps,
            oneMinutesLamps = oneMinutesLamps
        )
        assertEquals(clockExpected, clockResult)
    }

    @Test
    fun `test clock 22_08_41`() {
        val clockResult = BerlinClockController(22,8,41).getBerlinClockLamps()

        val fiveHoursLamps: Array<LampColor> = Array(4){ _-> LampColor.RED}
        val oneHourLamps: Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        oneHourLamps[0]=LampColor.RED
        oneHourLamps[1]=LampColor.RED
        val fiveMinutesLamps: Array<LampColor> = Array(11){ _-> LampColor.WHITE}
        fiveMinutesLamps[0] = LampColor.YELLOW
        val oneMinutesLamps: Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        oneMinutesLamps[0]=LampColor.YELLOW
        oneMinutesLamps[1]=LampColor.YELLOW
        oneMinutesLamps[2]=LampColor.YELLOW

        val clockExpected = ClockLamps(
            secondsLamp = LampColor.WHITE,
            fiveHoursLamps = fiveHoursLamps,
            oneHourLamps = oneHourLamps,
            fiveMinutesLamps = fiveMinutesLamps,
            oneMinutesLamps = oneMinutesLamps
        )
        assertEquals(clockExpected, clockResult)
    }
}