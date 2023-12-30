package com.example.click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            textView.text = "Hello Kitty!"
        }

        button.setOnClickListener{
            textView.text = "Я насчитал ${++counter} ворон"
        }
    }
}