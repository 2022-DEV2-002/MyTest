package com.berlin.clock.controller.utils

import com.berlin.clock.model.LampColor

object LampColorGenerator {
    fun generateSecondsLamp(seconds: Int): LampColor {
        return if (seconds % 2 == 0) LampColor.RED else LampColor.WHITE
    }
}