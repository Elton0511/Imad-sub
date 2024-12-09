package com.example.practicum


import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val weatherDetails = arrayOf(
        "Sunny, 35°c", "Cloudy, 27°C", "Rainy, 20°F", "Windy, 22°C", "Sunny, 37°C", "Cloudy, 25°C", "Rainy, 9°C"
    )

    private val temperatures = arrayOf(28, 30, 27, 20, 29, 21, 25)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val averageTempTextView = findViewById<TextView>(R.id.textViewAverageTemp)
        val listView = findViewById<ListView>(R.id.listViewDays)
        val detailButton = findViewById<Button>(R.id.buttonDetail)
        val exitButton = findViewById<Button>(R.id.buttonExit)
        val clearButton = findViewById<Button>(R.id.buttonClear)

        // Calculate average temperature
        val averageTemp = temperatures.average()
        averageTempTextView.text = "Average Temperature for the Week: %.2f°F".format(averageTemp)

        // Setup list adapter
        val adapter = ArrayAdapter(this, R.layout.activity_main2, daysOfWeek)
        listView.adapter = adapter

        // Set on item click listener to navigate to DetailActivity
        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("day", daysOfWeek[position])
                putExtra("weather", weatherDetails[position])
                putExtra("temperature", temperatures[position])
            }
            startActivity(intent)
        }

        // Set on click listener for the detail button
        detailButton.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }

        // Set on click listener for the exit button
        exitButton.setOnClickListener {
            finish()
        }

        // Set on click listener for the clear button
        clearButton.setOnClickListener {
            // Clear data logic here
        }
    }
}





