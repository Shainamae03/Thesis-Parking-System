package com.example.securityapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import java.text.SimpleDateFormat
import java.util.*


class ConParking : AppCompatActivity() {

    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_con_parking)

        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("CoN Area").child("Slot1")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                val stat = snapshot.child("status").value.toString()
                val rootRef = FirebaseDatabase.getInstance().reference
                val slot13 = findViewById<RelativeLayout>(R.id.slot13)
                val slot1 = findViewById<RelativeLayout>(R.id.slot1)
                slot13.setOnClickListener(object : View.OnClickListener {
                    override fun onClick(view: View?) {
                        calldata()
                        if (stat.equals("avail")) {
                            rootRef.child("CoN Area").child("Slot1").child("status").setValue("occupied")
                        } else {
                            rootRef.child("CoN Area").child("Slot1").child("status").setValue("avail")
                        }

                        val button = findViewById<Button>(R.id.backimg)
                        button.setOnClickListener {
                            startActivity(Intent(this@ConParking, Menu::class.java))
                        }
                    }

                    fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                onchange()
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

            fun onchange() {
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoN Area").child("Slot1")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val asss = findViewById<TextView>(R.id.asss)
                        val slot1s = findViewById<TextView>(R.id.slot1s)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat.equals("avail")) {
                            asss.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat.equals("occupied")) {
                            asss.setBackgroundResource(R.drawable.ic_car_small)

                        }
                    }


                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
            }

            fun calldata() {

                val df = SimpleDateFormat("EEE MM/dd/yyyy hh:mm.ss aa")
                val c = Calendar.getInstance()
                val str_time: String = df.format(c.time)
                val extras = intent.extras
                if (extras != null) {
                    val value = extras.getString("passkey")

                    val rootRef = FirebaseDatabase.getInstance().reference
                    val ordersRef = rootRef.child("ClientDb").orderByChild("clientcode").equalTo(value)
                    val valueEventListener = object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            for (ds in dataSnapshot.children) {
                                val username = ds.child("firtname").getValue(String::class.java)
                                val plnum = ds.child("plateNumber").getValue(String::class.java)

                                database = FirebaseDatabase.getInstance()
                                databaseReference = database?.reference!!.child("CoN Area").child("Slot1")
                                databaseReference = database?.reference!!.child("CoN Area").child("Slot2")
                                databaseReference?.addValueEventListener(object : ValueEventListener {
                                    override fun onDataChange(snapshot: DataSnapshot) {
                                        val slot = snapshot.child("sid").value.toString()
                                        val database = FirebaseDatabase.getInstance()

                                        val myRef = database.getReference("ParkingLogs")
                                        val map: HashMap<String, String?> = hashMapOf(
                                                "Name" to username,
                                                "PlateNumber" to plnum,
                                                "Date" to str_time,
                                                "Slot" to slot
                                        )
                                        myRef.push().setValue(map)

                                    }

                                    override fun onCancelled(error: DatabaseError) {
                                        TODO("Not yet implemented")
                                    }
                                })
                            }
                        }

                        override fun onCancelled(databaseError: DatabaseError) {
                            TODO("Not yet implemented")  //Don't ignore errors!
                        }
                    }
                    ordersRef.addListenerForSingleValueEvent(valueEventListener)
                } else {
                    Toast.makeText(this@ConParking, "Space Occupied", Toast.LENGTH_LONG)
                            .show()
                }
            }

        })
    }
}