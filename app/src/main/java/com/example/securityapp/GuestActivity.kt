package com.example.securityapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView

class GuestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)

        register()
    }
        private fun register() {

            val regButton = findViewById<Button>(R.id.saveclient)
            val backtomenu = findViewById<Button>(R.id.backtomenu)
            val f_name = findViewById<EditText>(R.id.f_name)
            val plate_no = findViewById<EditText>(R.id.plate_no)
            val remarks = findViewById<EditText>(R.id.remarks)
            val pur_vis = findViewById<EditText>(R.id.pur_vis)
            val dateof_entry= findViewById<EditText>(R.id.dateof_entry)
            val timeof_entry = findViewById<EditText>(R.id.timeof_entry)
            val Gate_No= findViewById<EditText>(R.id.Gate_No)
            val sgid = findViewById<EditText>(R.id.sgid)

            regButton.setOnClickListener {

                if (TextUtils.isEmpty(f_name.text.toString())) {
                    f_name.setError("Please enter Full name")
                    return@setOnClickListener
                } else if (TextUtils.isEmpty(plate_no.text.toString())) {
                    plate_no.setError("Please enter Plate Number")
                    return@setOnClickListener
                } else if (TextUtils.isEmpty(remarks.text.toString())) {
                    remarks.setError("Enter Remarks")
                    return@setOnClickListener
                } else if (TextUtils.isEmpty(pur_vis.text.toString())) {
                    pur_vis.setError("Purpose of the visit?")
                    return@setOnClickListener
                } else if (TextUtils.isEmpty(dateof_entry.text.toString())) {
                    dateof_entry.setError("Date of Entry")
                    return@setOnClickListener
                } else if (TextUtils.isEmpty(timeof_entry.text.toString())) {
                    timeof_entry.setError("Time of Entry")
                    return@setOnClickListener
                } else if (TextUtils.isEmpty(Gate_No.text.toString())) {
                    Gate_No.setError("Gate No:")
                    return@setOnClickListener
                } else if (TextUtils.isEmpty(sgid.text.toString())) {
                    sgid.setError("SGID")
                    return@setOnClickListener
                }
            }
           backtomenu.setOnClickListener{
               val alertDialog = AlertDialog.Builder(this)
               alertDialog.setCancelable(false)
               alertDialog.setMessage("Do you want to proceed?")
               alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
                   startActivity(Intent(this@GuestActivity, Menu::class.java))
               })
               alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                   dialog.cancel()
               })
               val alert = alertDialog.create();
               alert.setTitle("Do you want to exit?")
               alert.show()
           }
        }
    }
