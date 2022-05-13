package com.berlin.clock.controller.utils

import com.berlin.clock.model.LampColor

object LampColorGenerator {
    fun generateSecondsLamp(seconds: Int): LampColor {
        return LampColor.WHITE
    }
}