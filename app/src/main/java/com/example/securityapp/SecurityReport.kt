package com.example.securityapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class SecurityReport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security_report)

        val back3_btn = findViewById<ImageButton>(R.id.back3_btn)

        back3_btn.setOnClickListener {
                startActivity(Intent(this@SecurityReport, Menu::class.java))

        }
    }
}