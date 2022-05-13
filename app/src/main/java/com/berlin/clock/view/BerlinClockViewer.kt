package com.berlin.clock.view

import android.content.Context
import android.view.View
import com.berlin.clock.R
import com.berlin.clock.model.ClockLamps
import com.berlin.clock.model.LampColor

object BerlinClockViewer{

    fun viewClock(clockLamps: ClockLamps,context:Context,parentView:View){
        viewSecondsLamp(clockLamps.secondsLamp,context,parentView)
    }

    private fun viewFiveHoursLamps(){}
    private fun viewOneHourLamps(){}
    private fun viewFiveMinutesLamps(){}
    private fun viewOneMinuteLamps(){}
    private fun viewSecondsLamp(secondsLampColor:LampColor,context:Context,parentView:View){
        //val lampId= view.resources.getIdentifier("vi_seconds_lamp", "id", context.packageName)
        val lamp:View = parentView.findViewById(R.id.vi_seconds_lamp)
        if(secondsLampColor == LampColor.WHITE)
            lamp.background = context.getDrawable(R.drawable.circle_white)
            else
            lamp.background = context.getDrawable(R.drawable.circle_red)
    }
}