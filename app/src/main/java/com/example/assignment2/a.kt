package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        var button = findViewById<Button>(R.id.button_a)
        button.setOnClickListener(
            View.OnClickListener
        {

            startActivity(Intent(this, b::class.java));

        })
    }
}