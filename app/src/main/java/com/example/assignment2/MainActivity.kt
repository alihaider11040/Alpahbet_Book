package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    Button button1= findViewById<view>(R.id.button1) as Button
    button1.setOnClickListner(new View.OnClickListner()
    {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, a.class));
        }
    })




}