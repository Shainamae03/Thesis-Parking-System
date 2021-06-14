package com.example.securityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ForgotAdminPass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_admin_pass)

        val resetButton = findViewById<Button>(R.id.resetButton)
        val for_email = findViewById<EditText>(R.id.for_email)

        resetButton.setOnClickListener {
            val email: String = for_email.text.toString().trim { it <= ' ' }
            if (email.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter your email adress",
                    Toast.LENGTH_LONG
                ).show()
            }else {
                FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                    .addOnCompleteListener{task ->
                        if (task.isSuccessful) {
                            Toast.makeText(
                                this,
                                "Email sent successfuly to reset your password!",
                                Toast.LENGTH_LONG
                            ).show()
                            finish()
                        }else{
                            Toast.makeText(
                                this,
                                task.exception!!.message.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
            }
        }
    }
}