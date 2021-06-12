package com.example.securityapp

import android.Manifest
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.budiyev.android.codescanner.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import java.text.SimpleDateFormat
import java.util.*


private const val CAMERA_REQUEST_CODE = 101

class QRCodeScanner() : AppCompatActivity() {


    lateinit var auth: FirebaseAuth
    var databaseReference :  DatabaseReference? = null
    var database: FirebaseDatabase? = null


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
                val rootRef = FirebaseDatabase.getInstance().reference

                val ordersRef = rootRef.child("ClientDb").orderByChild("clientcode").equalTo(it.text)
                val valueEventListener = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val username = ds.child("firtname").getValue(String::class.java)
                            val plnum = ds.child("plateNumber").getValue(String::class.java)
                            val clientid = ds.child("empid").getValue(String::class.java)

                            auth = FirebaseAuth.getInstance()
                            database = FirebaseDatabase.getInstance()
                            databaseReference = database?.reference!!.child("SecuDb")

                            val user = auth.currentUser
                            val userreference = databaseReference?.child(user?.uid!!)

                            userreference?.addValueEventListener(object : ValueEventListener {
                                override fun onDataChange(snapshot: DataSnapshot) {

                                    val secuid = snapshot.child("AdminID").value.toString()

                                    val dialog = Dialog(this@QRCodeScanner)
                                    //We have added a title in the custom layout. So let's disable the default title.
                                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                                    //The user will be able to cancel the dialog bu clicking anywhere outside the dialog.
                                    dialog.setCancelable(true)
                                    //Mention the name of the layout of your custom dialog.
                                    dialog.setContentView(R.layout.dialogpopup)
                                    //Initializing the views of the dialog.
                                    val cc: TextView = dialog.findViewById(R.id.name_et)
                                    val name: TextView = dialog.findViewById(R.id.cc_et)
                                    val pl: TextView = dialog.findViewById(R.id.pl_et)
                                    val sgid: TextView = dialog.findViewById(R.id.sg_et)

                                    name.text = username
                                    cc.text = it.text
                                    pl.text = plnum
                                    sgid.text = secuid

                                    val submitButton: Button =
                                        dialog.findViewById(R.id.accept_button)
                                    submitButton.setOnClickListener(object : View.OnClickListener {
                                        override fun onClick(v: View?) {

                                            val database = FirebaseDatabase.getInstance()
                                            val myRef = database.getReference("ClientLogs")
                                            val map: HashMap<String, String?> = hashMapOf(
                                                "Name" to username,
                                                "PlateNumber" to plnum,
                                                "Date" to str_time,
                                                "SGID" to secuid,
                                                "Empid" to clientid,
                                                "Logs" to "Login",
                                                "LogStat" to "Entry"
                                            )
                                            myRef.push().setValue(map)
                                            dialog.dismiss()
                                            val value = it.text
                                            val i = Intent(
                                                this@QRCodeScanner,
                                                ParkingFragment::class.java
                                            )
                                            i.putExtra("key", value)
                                            startActivity(i)
                                        }
                                    })

                                    val denyButton: Button = dialog.findViewById(R.id.deny_button)
                                    denyButton.setOnClickListener(object : View.OnClickListener {
                                        override fun onClick(v: View?) {

                                            val alertDialog =
                                                AlertDialog.Builder(this@QRCodeScanner)
                                            alertDialog.setCancelable(false)
                                            alertDialog.setMessage("What do you mean?")
                                            alertDialog.setPositiveButton(
                                                "EXIT",
                                                DialogInterface.OnClickListener { dialog, id ->
                                                    val database = FirebaseDatabase.getInstance()
                                                    val myRef = database.getReference("ClientLogs")
                                                    val map: HashMap<String, String?> = hashMapOf(
                                                        "Name" to username,
                                                        "PlateNumber" to plnum,
                                                        "Date" to str_time,
                                                        "SGID" to secuid,
                                                        "Empid" to clientid,
                                                        "Logs" to "LogOut",
                                                        "LogStat" to "Exit"
                                                    )
                                                    myRef.push().setValue(map)

                                                })
                                            alertDialog.setNegativeButton(
                                                "DENY",
                                                DialogInterface.OnClickListener { dialog, id ->
                                                    dialog.cancel()
                                                })
                                            val alert = alertDialog.create();
                                            alert.setTitle("EXIT OR DENY")
                                            alert.show()
                                            dialog.dismiss()
                                        }
                                    })
                                    dialog.show()
                                }

                                override fun onCancelled(error: DatabaseError) {
                                    TODO("Not yet implemented")
                                }
                            })


                        }
                    }

                    override fun onCancelled(databaseError: DatabaseError) {
                        TODO("Not yet implemented") //Don't ignore errors!
                    }
                }
                ordersRef.addListenerForSingleValueEvent(valueEventListener)


//                val code : String = "$it"
//                val code2: String = "$str_time"
//                val intent = Intent(this, ClientInfo::class.java)
//                val textView = findViewById(R.id.textView) as TextView
//                val MyDateText = findViewById(R.id.MyDateText) as TextView
//                MyDateText.text = "$str_time"
//                textView.text = it.text
//                intent.putExtra("result", code)
//                intent.putExtra("result2", code2)
//                startActivity(intent)

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
