package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "Hello from Hermes Agent!"
        textView.textSize = 24f
        textView.setPadding(48, 48, 48, 48)
        setContentView(textView)
    }
}
