package com.example.securityapp

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseError
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.firebase.database.core.Tag


class ClientInfo : AppCompatActivity() {


    lateinit var auth: FirebaseAuth
    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    private lateinit var ivQRCode: ImageView
    private lateinit var tv: TextView

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_info)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("ClientDb")

        val intent = intent
        val capt = intent.getStringExtra("result")
        val capt2 = intent.getStringExtra("result2")
        val result2_tv = findViewById<TextView>(R.id.MyDateText)
        result2_tv.text = capt2
        val result_tv = findViewById<TextView>(R.id.textView)
        result_tv.text = capt
        val result = auth.currentUser
        val userreference = databaseReference?.child(result?.uid!!)
        val clientcode = findViewById<TextView>(R.id.clientcode)
        val firtname = findViewById<TextView>(R.id.firtname)
        val department = findViewById<TextView>(R.id.department)


    }
}
