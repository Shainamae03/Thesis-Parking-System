package com.example.securityapp

import android.Manifest
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.budiyev.android.codescanner.*
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.text.SimpleDateFormat
import java.util.*


private const val CAMERA_REQUEST_CODE = 101

class QRCodeScanner() : AppCompatActivity() {





    private lateinit var codeScanner: CodeScanner
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q_r_code_scanner)
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar()?.hide();


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) ==
            PackageManager.PERMISSION_DENIED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 123)
        } else {
            startScanning()
        }

    }

    private fun startScanning() {
        val scannerView: CodeScannerView = findViewById(R.id.scanner_view)
        codeScanner = CodeScanner(this, scannerView)
        codeScanner.camera = CodeScanner.CAMERA_BACK
        codeScanner.formats = CodeScanner.ALL_FORMATS

        codeScanner.autoFocusMode = AutoFocusMode.SAFE
        codeScanner.scanMode = ScanMode.SINGLE
        codeScanner.isAutoFocusEnabled = true
        codeScanner.isFlashEnabled = false


        codeScanner.decodeCallback = DecodeCallback {



            runOnUiThread {
                val df = SimpleDateFormat("EEE MM/dd/yyyy hh:mm.ss aa")
                val c = Calendar.getInstance()
                val str_time: String = df.format(c.time)
           //     val rootRef = FirebaseDatabase.getInstance().reference
         //       val ordersRef = rootRef.child("ClientDb").orderByChild("clientcode").equalTo(it.text)




              //  val valueEventListener = object : ValueEventListener {
                ///    override fun onDataChange(dataSnapshot: DataSnapshot) {
                //        for (ds in dataSnapshot.children) {
                //            val username = ds.child("firtname").getValue(String::class.java )
              //              val plnum = ds.child("plateNumber").getValue(String::class.java)

                     //       val alertDialog = AlertDialog.Builder(this@QRCodeScanner)

               //             alertDialog.setCancelable(false)
              //              alertDialog.setMessage("Client Code: ${it.text} \n Name: $username \n Plate no.: $plnum \n Progress saved at $str_time")
            //                alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, id ->




                 //           })
             //  /             alertDialog.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                //                dialog.cancel()
              //              })
            //                val alert = alertDialog.create();
          //                  alert.setTitle("Accept Client?")
         //                   alert.show()

                   //     }
            //        }
//
          //          override fun onCancelled(databaseError: DatabaseError) {
        //                TODO("Not yet implemented") //Don't ignore errors!
        //            }
      //          }
           //     ordersRef.addListenerForSingleValueEvent(valueEventListener)


              val code : String = "$it"
               val code2: String = "$str_time"
               val intent = Intent(this, ClientInfo::class.java)
                val textView = findViewById(R.id.textView) as TextView
                val MyDateText = findViewById(R.id.MyDateText) as TextView
            Toast.makeText(applicationContext, "Scan Result \n Client Code: ${it.text} \n  \"Progress saved at $str_time ", Toast.LENGTH_SHORT).show()
             MyDateText.text = "$str_time"
              textView.text = it.text
                      intent.putExtra("result", code)
             intent.putExtra("result2", code2)
                startActivity(intent)

            }
        }
    codeScanner.errorCallback = ErrorCallback {
           runOnUiThread {
               Toast.makeText(this, "Camera inilization Error:${it.message}", Toast.LENGTH_SHORT)
                   .show()

            }
      }
    scannerView.setOnClickListener {
            codeScanner.startPreview()
        }
    }

    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 123) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Camera Permission Granted", Toast.LENGTH_SHORT).show()
                startScanning()

            } else {
                Toast.makeText(this, "Camera Permission Denied ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (::codeScanner.isInitialized) {
            codeScanner?.startPreview()
        }
    }

    override fun onPause() {
        if (::codeScanner.isInitialized) {
            codeScanner?.releaseResources()
        }
        super.onPause()
    }
}
