package com.example.securityapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Menu : AppCompatActivity() {
    private val parkingfragment =  ParkingFragment()
    private val logsfragment =  LogsFragment()
    private val accountfragment =  AccountFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        replaceFragment(parkingfragment)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomnavigation)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.park -> replaceFragment(parkingfragment)
                R.id.logs -> replaceFragment(logsfragment)
                R.id.scanner -> {
                    val intent = Intent(this@Menu, QRCodeScanner::class.java)
                    startActivity(intent)
                   }
                R.id.guest -> {
                    val intent = Intent(this@Menu, GuestActivity::class.java)
                    startActivity(intent)
                }
                R.id.account -> replaceFragment(accountfragment)
            }
            true
        }
    }
    private fun replaceFragment(fragment:Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            val frameLayout = findViewById<FrameLayout>(R.id.container)
            transaction.replace(R.id.container,fragment)
            transaction.commit()
        }



/*
        val parkingfragment= ParkingFragment()
        val logsfragment= LogsFragment()
        val scannerfragment= ScannerFragment()
        val guestfragment= parkingFragment()
        val accountfragment= parkingFragment()*/
 /*      val parking_space = findViewById(R.id.parking_space) as CardView
        val parking_log = findViewById(R.id.parking_log) as CardView
        val parking_scanner = findViewById(R.id.parking_scanner) as CardView
        val guest = findViewById(R.id.guest) as CardView
        val back = findViewById(R.id.back) as CardView
*/
     /*   parking_space.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setCancelable(false)
            alertDialog.setMessage("Do you want to proceed?")
            alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
                startActivity(Intent(this@Menu, Notification::class.java))
            })
            alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
            val alert = alertDialog.create();
            alert.setTitle("Approve Upon Entry")
            alert.show()
        }
        parking_log.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setCancelable(false)
            alertDialog.setMessage("Do you want to proceed?")
            alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
                startActivity(Intent(this@Menu, ParkingLot::class.java))
            })
            alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
            val alert = alertDialog.create();
            alert.setTitle("Do you want to leave this page?")
            alert.show()
        }
        parking_scanner.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setCancelable(false)
            alertDialog.setMessage("Do you want to proceed?")
            alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
                startActivity(Intent(this@Menu, QRCodeScanner::class.java))
            })
            alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
            val alert = alertDialog.create();
            alert.setTitle("Do you want to leave this page?")
            alert.show()
        }
        back.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setCancelable(false)
            alertDialog.setMessage("Do you want to proceed?")
            alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
                startActivity(Intent(this@Menu, MainActivity::class.java))
            })
            alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
            val alert = alertDialog.create();
            alert.setTitle("Do you want to exit?")
            alert.show()
        }
        guest.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setCancelable(false)
            alertDialog.setMessage("Do you want to proceed?")
            alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->
                startActivity(Intent(this@Menu, GuestActivity::class.java))
            })
            alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
            val alert = alertDialog.create();
            alert.setTitle("Do you want to proceed?")
            alert.show()*/
      //  }
    }
}