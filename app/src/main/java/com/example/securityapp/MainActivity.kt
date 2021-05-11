package com.example.securityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.Scanner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)



            val secuname = findViewById(R.id.secuname) as EditText
            val code = findViewById(R.id.code) as EditText
            val  button = findViewById(R.id.button) as Button
            val button2 = findViewById(R.id.button2) as Button

            button.setOnClickListener {
                val Secu_Name = secuname.text;
                val Secu_Code = code.text;
                startActivity(Intent(this@MainActivity, Captcha::class.java))

            }
            button2.setOnClickListener {
                finishAffinity()
            }
        }
    }


