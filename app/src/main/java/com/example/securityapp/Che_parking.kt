package com.example.securityapp

import android.annotation.TargetApi
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class Che_parking : AppCompatActivity() {

    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_che_parking)

        testing()
        onchange()
    }

    fun onchange() {
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("CHE Area").child("Slot1")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot1as = findViewById<TextView>(R.id.Slot1as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot1as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot1as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("CHE Area").child("Slot2")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot2as = findViewById<TextView>(R.id.slot2as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot2as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot2as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("CHE Area").child("Slot3")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot3as = findViewById<TextView>(R.id.slot3as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot3as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot3as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("CHE Area").child("Slot4")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot4as = findViewById<TextView>(R.id.slot4as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot4as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot4as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }

    fun testing(){
        val rootRef = FirebaseDatabase.getInstance().reference
        val slot1 = findViewById<RelativeLayout>(R.id.slot1)
        val CoN1 = rootRef.child("CHE Area").orderByChild("sid").equalTo("CHE1")
        val CoNlistener1 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot1.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("CHE Area").child("Slot1").child("status").setValue("occupied")
                            } else {
                                statchange.child("CHE Area").child("Slot1").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN1.addListenerForSingleValueEvent(CoNlistener1)
        val slot2 = findViewById<RelativeLayout>(R.id.slot2)
        val CoN2 = rootRef.child("CHE Area").orderByChild("sid").equalTo("CHE2")
        val CoNlistener2 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot2.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("CHE Area").child("Slot2").child("status").setValue("occupied")
                            } else {
                                statchange.child("CHE Area").child("Slot2").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN2.addListenerForSingleValueEvent(CoNlistener2)
        val slot3 = findViewById<RelativeLayout>(R.id.slot3)
        val CoN3 = rootRef.child("CHE Area").orderByChild("sid").equalTo("CHE3")
        val CoNlistener3 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot3.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("CHE Area").child("Slot3").child("status").setValue("occupied")
                            } else {
                                statchange.child("CHE Area").child("Slot3").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN3.addListenerForSingleValueEvent(CoNlistener3)
        val slot4 = findViewById<RelativeLayout>(R.id.slot4)
        val CoN4 = rootRef.child("CHE Area").orderByChild("sid").equalTo("CHE4")
        val CoNlistener4 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot4.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("CHE Area").child("Slot4").child("status").setValue("occupied")
                            } else {
                                statchange.child("CHE Area").child("Slot4").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN4.addListenerForSingleValueEvent(CoNlistener4)
}
}

