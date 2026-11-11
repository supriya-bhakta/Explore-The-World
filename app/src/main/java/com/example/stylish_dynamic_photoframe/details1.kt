package com.example.stylish_dynamic_photoframe

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class details1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.details1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvPlaceName = findViewById<TextView>(R.id.tvPlaceName)
        val placeName = intent.getStringExtra("placeName")
        tvPlaceName.text = placeName

    }
}