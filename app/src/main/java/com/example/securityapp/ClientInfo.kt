package com.example.securityapp

import android.annotation.TargetApi
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.firebase.database.core.Tag
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.qrcode.QRCodeWriter
import org.w3c.dom.Text


class ClientInfo : AppCompatActivity() {


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

        val Approve_btn = findViewById(R.id.Approve_btn) as Button
        val Deny_btn = findViewById(R.id.Deny_Btn) as Button

            var intent = intent
            val capt = intent.getStringExtra("result")
            val capt2 = intent.getStringExtra("result2")
            val result2_tv = findViewById<TextView>(R.id.data2)
            result2_tv.text = capt2
            val result_tv = findViewById<TextView>(R.id.data)
            result_tv.text = capt

        Approve_btn.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setCancelable(false)
            alertDialog.setMessage("Do you want to proceed?")
            alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
                startActivity(Intent(this@ClientInfo, ParkingLot::class.java))
            })
            alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
            val alert = alertDialog.create();
            alert.setTitle("Do you want to leave this page?")
            alert.show()
        }
        Deny_btn.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setCancelable(false)
            alertDialog.setMessage("Do you want to proceed?")
            alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
               startActivity(Intent(this@ClientInfo, SecurityReport::class.java))
            })
            alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
            val alert = alertDialog.create();
            alert.setTitle("Do you want to leave this page?")
            alert.show()
            }
            val rootRef = FirebaseDatabase.getInstance().reference
            val ordersRef = rootRef.child("ClientDb").orderByChild("clientcode").equalTo(capt)




            val valueEventListener = object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    for (ds in dataSnapshot.children) {
                        val username = ds.child("firtname").getValue(String::class.java)
                        val plnum = ds.child("plateNumber").getValue(String::class.java)
                        val department = ds.child("branch").getValue(String::class.java)
                        val deptcode = ds.child("deptcode").getValue(String::class.java)
                        val branch = ds.child("department").getValue(String::class.java)
                        Toast.makeText(
                            applicationContext,
                            "Client Code: $username \n Name: $department \n Plate no.: $plnum \n $branch \n $deptcode  Progress saved at $capt",
                            Toast.LENGTH_SHORT
                        ).show()
                        val capt = findViewById<TextView>(R.id.username)
                        capt.text = "$username"
                        val capt2 = findViewById<TextView>(R.id.plnumber)
                        capt2.text = "$plnum"
                        val capt3 = findViewById<TextView>(R.id.branch)
                        capt3.text = "$branch"
                        val capt4 = findViewById<TextView>(R.id.department)
                        capt4.text = "$department"
                        val capt5 = findViewById<TextView>(R.id.deptcode)
                        capt5.text = "$deptcode"
                    }

                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
                }
            }
            ordersRef.addListenerForSingleValueEvent(valueEventListener)
        }

    }



