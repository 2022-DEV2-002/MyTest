package com.berlin.clock.controller


import com.berlin.clock.controller.utils.LampColorGenerator
import com.berlin.clock.model.ClockLamps
import com.berlin.clock.model.LampColor
import org.junit.Test
import org.junit.Assert.*

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
}