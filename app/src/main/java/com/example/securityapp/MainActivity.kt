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
            val login = findViewById(R.id.login) as Button


           login.setOnClickListener {
                val Secu_Name = secuname.text;
                val Secu_Code = code.text;
                startActivity(Intent(this@MainActivity, Menu::class.java))

            }

        }
    }


