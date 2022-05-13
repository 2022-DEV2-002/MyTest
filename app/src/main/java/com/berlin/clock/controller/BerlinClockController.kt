package com.berlin.clock.controller


import com.berlin.clock.controller.utils.LampColorGenerator
import com.berlin.clock.model.ClockLamps

class BerlinClockController(
    private val hours: Int,
    private val minutes: Int,
    private val seconds: Int
) {

    fun getBerlinClockLamps(): ClockLamps {
        return ClockLamps(secondsLamp = LampColorGenerator.generateSecondsLamp(seconds))
    }
}