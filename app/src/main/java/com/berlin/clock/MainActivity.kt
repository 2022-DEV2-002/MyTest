package com.berlin.clock


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvClock:TextView = findViewById(R.id.tv_text_clock)

        var timer = object: CountDownTimer(Long.MAX_VALUE, 1000){
            override fun onTick(millisUntilFinished: Long) {
                val sdf = SimpleDateFormat("hh:mm:ss")
                val currentDate = sdf.format(Date())
                tvClock.text = currentDate
            }

            override fun onFinish() {}
        }
        timer.start()
    }
}