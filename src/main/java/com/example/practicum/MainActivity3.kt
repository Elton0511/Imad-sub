package com.example.practicum

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)


                val day = intent.getStringExtra("day")
                val weather = intent.getStringExtra("weather")

                val textViewDay = findViewById<TextView>(R.id.textViewDay)
                val textViewWeather = findViewById<TextView>(R.id.textViewWeather)

                textViewDay.text = day
                textViewWeather.text = weather
            }
        }
