package com.example.securityapp

import android.annotation.TargetApi
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.qrcode.QRCodeWriter
import org.w3c.dom.Text


class ClientInfo : AppCompatActivity() {


    private lateinit var result: DatabaseReference
    private lateinit var clientlog: RecyclerView
    private lateinit var clientArrayList: ArrayList<User>
    lateinit var auth: FirebaseAuth
    var databaseReference: DatabaseReference? = result
    var database: FirebaseDatabase? = null

    private lateinit var ivQRCode: ImageView
    private lateinit var tv: TextView

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_info)


        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        getSupportActionBar()?.hide();

        var intent = intent
        val capt = intent.getStringExtra("result")
        val capt2 = intent.getStringExtra("result2")
        val result2_tv = findViewById<TextView>(R.id.data2)
        result2_tv.text = capt2
        val result_tv = findViewById<TextView>(R.id.data)
        result_tv.text = capt


        clientlog = findViewById(R.id.clientlog)
        clientlog.layoutManager = LinearLayoutManager(this, )
        clientlog.setHasFixedSize(true)


        clientArrayList = arrayListOf()
        getUserData()

    }

    private fun getUserData() {
        result = FirebaseDatabase.getInstance().getReference("ClientDb")
        result.addValueEventListener(object : ValueEventListener {


            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    for (userSnapshot in snapshot.children) {
                        val user = userSnapshot.getValue(User::class.java)
                        clientArrayList.add(user!!)
                    }
                }
                clientlog.adapter = CHAdapter(clientArrayList)
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}






