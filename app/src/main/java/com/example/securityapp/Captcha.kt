package com.example.securityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.safetynet.SafetyNet
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import java.util.concurrent.Executor
import kotlin.random.Random
import android.view.View as View1


class Captcha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_captcha)

        val button3 = findViewById(R.id.button3) as Button
        val captcha = findViewById(R.id.captcha) as TextView

        button3.setOnClickListener {
            val generateID = captcha.text
        }
    }
}