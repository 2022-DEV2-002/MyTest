package com.berlin.clock.controller.utils

import com.berlin.clock.model.LampColor

object LampColorGenerator {
    fun generateSecondsLamp(seconds: Int): LampColor {
        return if (seconds % 2 == 0) LampColor.RED else LampColor.WHITE
    }
    fun generateFiveMinutesLamps(minutes: Int): Array<LampColor> {
        var fiveMinutesLamps:Array<LampColor> = Array(11){ _-> LampColor.WHITE}
        return fiveMinutesLamps
    }

    fun generateOneMinuteLamps(minutes: Int): Array<LampColor> {
        var oneMinuteLamps:Array<LampColor> = Array(4){ _-> LampColor.WHITE}
        return oneMinuteLamps
    }
}