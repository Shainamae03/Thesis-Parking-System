package com.example.securityapp

import android.annotation.TargetApi
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class ParkingLot : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_lot)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar()?.hide();

        val cardView = findViewById<CardView>(R.id.backtohome)
        cardView.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        val law = findViewById<CardView>(R.id.claw)
        law.setOnClickListener {
            val intent = Intent(this, ParkingLaw::class.java)
            startActivity(intent)
        }

        val con = findViewById<CardView>(R.id.cn)
        con.setOnClickListener {
            val extras = intent.extras
            if (extras != null) {
                val value = extras.getString("key")
                val passval = value
                val i = Intent(this@ParkingLot, ConParking::class.java)
                i.putExtra("passkey", passval)
                startActivity(i)
            }
        }
        val hp = findViewById<CardView>(R.id.hp)
        hp.setOnClickListener {
            val intent = Intent(this, HeroesPark::class.java)
            startActivity(intent)
        }
        val che = findViewById<CardView>(R.id.che)
        che.setOnClickListener {
            val intent = Intent(this, Che_parking::class.java)
            startActivity(intent)
        }
        val PL = findViewById<CardView>(R.id.parkinglogs)
        PL.setOnClickListener {
            val intent = Intent(this, ParkingLogs::class.java)
            startActivity(intent)
        }
    }
}