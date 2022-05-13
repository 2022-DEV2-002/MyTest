package com.berlin.clock.controller


import com.berlin.clock.controller.utils.LampColorGenerator
import com.berlin.clock.model.ClockLamps
import com.berlin.clock.model.LampColor
import org.junit.Test
import org.junit.Assert.*

class BerlinClockControllerUnitTest{
    @Test
    fun `test all white lamps`() {
        val clockResult = BerlinClockController(0,0,0)
        val clockExpected = ClockLamps()
        assertEquals(clockExpected, clockResult)
    }
}