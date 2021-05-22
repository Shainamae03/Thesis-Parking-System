package com.example.securityapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*


class ClientInfo : AppCompatActivity() {

private lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_info)
         var intent = intent
        val capt = intent.getStringExtra("result")
        val result_tv = findViewById<TextView>(R.id.data)
            result_tv.text = capt
     }

        }