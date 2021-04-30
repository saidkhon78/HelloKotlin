package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SimpleAdapter
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickcount = 0.0
    var startTime = System.currentTimeMillis()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickme)
        val txtElapsdTime = findViewById<TextView>(R.id.txtElapsedTime)

        btnClickMe.setOnClickListener {
            clickcount++
            var elapsedSeconds : Long =((System.currentTimeMillis() - startTime) / 1000.0).toLong()
            txtCountBtnClicks.text = "Button clicks = " + clickcount //"Button clicks = ${clickcount}" "Button clicks = " + clickcount
            txtElapsdTime.text = "${elapsedSeconds} seconds elapsed"
        }
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        txtActivityStartTime.text = "Activity start time = ${timeText}"

    }
}