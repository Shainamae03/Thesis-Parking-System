package com.example.securityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import java.util.Scanner

class MainActivity : AppCompatActivity() {

    lateinit var authSecu: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)

        authSecu = FirebaseAuth.getInstance()
        val currentUser = authSecu.currentUser

        login()
    }

    private fun login(){

            val secuname = findViewById(R.id.secuname) as EditText
            val code = findViewById(R.id.code) as EditText
            val  button = findViewById(R.id.login) as Button

        button.setOnClickListener {
            if (TextUtils.isEmpty(secuname.text.toString())) {
                secuname.setError("Please enter your email!")
                return@setOnClickListener
            } else if (TextUtils.isEmpty(code.text.toString())) {
                code.setError("Please enter password!")
                return@setOnClickListener
            }

            authSecu.signInWithEmailAndPassword(
                    secuname.text.toString(),
                    code.text.toString()
            )
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            startActivity(Intent(this@MainActivity, Menu::class.java))
                            finish()

                        } else {
                            Toast.makeText(this@MainActivity, "Login failed", Toast.LENGTH_LONG)
                                    .show()
                        }
                        val maxLength = 10
                        val filters = arrayOfNulls<InputFilter>(1)
                        filters[0] = InputFilter.LengthFilter(maxLength)
                        code.setFilters(filters)
                    }



        }

        }
    }


