package com.example.securityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.firebase.database.*

class HeroesPark : AppCompatActivity() {

    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes_park)


        testing()
        onchange()
    }

    fun onchange() {
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot1")
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
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot2")
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
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot3")
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
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot4")
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
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot5")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot5as = findViewById<TextView>(R.id.slot5as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot5as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot5as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot6")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot6as = findViewById<TextView>(R.id.slot6as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot6as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot6as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot7")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot7as = findViewById<TextView>(R.id.slot7as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot7as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot7as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot8")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot8as = findViewById<TextView>(R.id.slot8as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot8as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot8as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot9")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot9as = findViewById<TextView>(R.id.slot9as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot9as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot9as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot10")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot10as = findViewById<TextView>(R.id.slot10as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot10as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot10as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot11")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot11as = findViewById<TextView>(R.id.slot11as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot11as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot11as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot12")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val Slot12as = findViewById<TextView>(R.id.slot12as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    Slot12as.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    Slot12as.setBackgroundResource(R.drawable.rectangle_red)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("Heroes Park").child("Slot13")
        databaseReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stat = snapshot.child("status").value.toString()
                val asss = findViewById<TextView>(R.id.slot13as)
                //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                if (stat == "avail") {
                    asss.setBackgroundResource(R.drawable.rectangle)
                } else if (stat == "occupied") {
                    asss.setBackgroundResource(R.drawable.rectangle_red)
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
        val CoN1 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP1")
        val CoNlistener1 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot1.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot1").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot1").child("status").setValue("avail")
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
        val CoN2 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP2")
        val CoNlistener2 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot2.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot2").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot2").child("status").setValue("avail")
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
        val CoN3 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP3")
        val CoNlistener3 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot3.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot3").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot3").child("status").setValue("avail")
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
        val CoN4 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP4")
        val CoNlistener4 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot4.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot4").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot4").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN4.addListenerForSingleValueEvent(CoNlistener4)

        val slot5 = findViewById<RelativeLayout>(R.id.slot5)
        val CoN5 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP5")
        val CoNlistener5 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot5.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot5").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot5").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN5.addListenerForSingleValueEvent(CoNlistener5)

        val slot6 = findViewById<RelativeLayout>(R.id.slot6)
        val CoN6 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP6")
        val CoNlistener6 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot6.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot6").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot6").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN6.addListenerForSingleValueEvent(CoNlistener6)
        val slot7 = findViewById<RelativeLayout>(R.id.slot7)
        val CoN7 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP7")
        val CoNlistener7 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot7.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot7").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot7").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN7.addListenerForSingleValueEvent(CoNlistener7)
        val slot8 = findViewById<RelativeLayout>(R.id.slot8)
        val CoN8 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP8")
        val CoNlistener8 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot8.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot8").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot8").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN8.addListenerForSingleValueEvent(CoNlistener8)
        val slot9 = findViewById<RelativeLayout>(R.id.slot9)
        val CoN9 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP9")
        val CoNlistener9 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot9.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot9").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot9").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN9.addListenerForSingleValueEvent(CoNlistener9)
        val slot10 = findViewById<RelativeLayout>(R.id.slot10)
        val CoN10 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP10")
        val CoNlistener10 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot10.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot10").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot10").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN10.addListenerForSingleValueEvent(CoNlistener10)
        val slot11 = findViewById<RelativeLayout>(R.id.slot11)
        val CoN11 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP11")
        val CoNlistener11 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot11.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot11").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot11").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN11.addListenerForSingleValueEvent(CoNlistener11)
        val slot12 = findViewById<RelativeLayout>(R.id.slot12)
        val CoN12 = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP12")
        val CoNlistener12 = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot12.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot12").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot12").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        CoN12.addListenerForSingleValueEvent(CoNlistener12)

        val slot13 = findViewById<RelativeLayout>(R.id.slot13)
        val ordersRef = rootRef.child("Heroes Park").orderByChild("sid").equalTo("HP13")
        val valueEventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (ds in dataSnapshot.children) {
                    val stat = ds.child("status").getValue(String::class.java)
                    slot13.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(view: View?) {
                            val statchange = FirebaseDatabase.getInstance().reference
                            if (stat.equals("avail")) {
                                statchange.child("Heroes Park").child("Slot13").child("status").setValue("occupied")
                            } else {
                                statchange.child("Heroes Park").child("Slot13").child("status").setValue("avail")
                            }
                        }
                    })
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {
            }
        }
        ordersRef.addListenerForSingleValueEvent(valueEventListener)
    }
}