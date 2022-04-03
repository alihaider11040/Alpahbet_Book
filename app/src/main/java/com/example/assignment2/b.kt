package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        var button = findViewById<Button>(R.id.button_b)
        button.setOnClickListener(
            View.OnClickListener
        {

            startActivity(Intent(this, c::class.java));

        })
    }
}