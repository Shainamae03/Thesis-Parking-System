package com.example.securityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ParkingLot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_lot)
        val back2_btn = findViewById(R.id.back2_btn) as Button

        back2_btn.setOnClickListener {
            startActivity(Intent(this@ParkingLot, Notification::class.java))
        }
    }
}