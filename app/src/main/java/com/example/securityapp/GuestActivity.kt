package com.example.securityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.text.SimpleDateFormat
import java.util.*

class GuestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)

        registeradmin()
    }

    private fun registeradmin() {
        val adminID = findViewById<EditText>(R.id.adminID)
        val adminName = findViewById<EditText>(R.id.adminName)
        val adminpass = findViewById<EditText>(R.id.vehicle)
        val emailaddress = findViewById<EditText>(R.id.reason)
        val saveclient = findViewById<Button>(R.id.saveclient)



        saveclient.setOnClickListener {

                    val name = adminName.text.toString()
                    val reason = emailaddress.text.toString()
                    val vehicle = adminpass.text.toString()
                    val plnum = adminID.text.toString()

                    val df = SimpleDateFormat("EEE MM/dd/yyyy hh:mm.ss aa")
                    val c = Calendar.getInstance()
                    val str_time: String = df.format(c.time)

                    val database = FirebaseDatabase.getInstance()
                    val myRef = database.getReference("GuestLogs")
                    val map: HashMap<String, String?> = hashMapOf(
                        "Name" to name,
                        "Reason" to reason,
                        "Vehicle" to vehicle,
                        "PlateNumber" to plnum,
                        "Date" to str_time
                    )
                    myRef.push().setValue(map)

                        Toast.makeText(this@GuestActivity, "Succes!", Toast.LENGTH_LONG).show()
                        finish()
                    }
}}
