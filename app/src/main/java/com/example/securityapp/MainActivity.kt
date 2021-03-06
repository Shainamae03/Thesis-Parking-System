package com.example.securityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import java.util.Scanner

class MainActivity : AppCompatActivity() {

    lateinit var authSecu: FirebaseAuth
    var databaseReferenceSecu: DatabaseReference? = null
    var databaseSecu: FirebaseDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        authSecu = FirebaseAuth.getInstance()
        val currentUser = authSecu.currentUser
        if (currentUser != null) {
            startActivity(Intent(this@MainActivity, Menu::class.java))
        }

        login()
    }

    var totalAttempts = 3

    private fun login() {

        val secuname = findViewById<EditText>(R.id.secuname)
        val code = findViewById<EditText>(R.id.code)
        val button = findViewById<ImageButton>(R.id.login)

        button.setOnClickListener {
            if (TextUtils.isEmpty(secuname.text.toString())) {
                secuname.error = "Please enter your email!"
                return@setOnClickListener
            } else if (TextUtils.isEmpty(code.text.toString())) {
                code.error = "Please enter password!"
                return@setOnClickListener
            }

            authSecu.signInWithEmailAndPassword(
                    secuname.text.toString(),
                    code.text.toString()
            )
                    .addOnCompleteListener {
                        if (totalAttempts != 0) {
                            if (it.isSuccessful) {
                                authSecu = FirebaseAuth.getInstance()
                                databaseSecu = FirebaseDatabase.getInstance()
                                val currentUserSecu = authSecu.currentUser
                                val registeredUserID = currentUserSecu?.getUid()

                                databaseReferenceSecu = registeredUserID?.let { it1 -> databaseSecu?.reference!!.child("SecuDb").child(it1) }

                                databaseReferenceSecu?.addValueEventListener(object : ValueEventListener {
                                    override fun onDataChange(snapshot: DataSnapshot) {

                                        val ClientDb = snapshot.child("As").value.toString()

                                        if (ClientDb.equals("Security")) {
                                            startActivity(Intent(this@MainActivity, Menu::class.java))
                                            finish()
                                        }
                                    }

                                    override fun onCancelled(error: DatabaseError) {
                                        TODO("Not yet implemented")
                                    }
                                })
                            }else
                                Toast.makeText(this@MainActivity, "Number of attemps left: ${totalAttempts}", Toast.LENGTH_LONG).show()
                                totalAttempts--;

                        } else{
                            Toast.makeText(this, "Maximum number of attempts exceeded", Toast.LENGTH_SHORT)
                                    .show()
                        }
                                }
                            }
                        }
                    }













