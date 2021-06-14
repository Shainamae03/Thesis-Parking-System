package com.example.securityapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*


class ParkingLaw : AppCompatActivity() {

    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_law)

                testing()
                onchange()
            }

            fun onchange() {
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot1")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot2")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot3")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot4")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot5")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot6")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot7")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot8")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot9")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot10")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot11")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot12")
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
                databaseReference = database?.reference!!.child("CoL Area").child("Slot13")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val asss = findViewById<TextView>(R.id.asss)
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
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot14")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot14as = findViewById<TextView>(R.id.slot14as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot14as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot14as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot15")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot15as = findViewById<TextView>(R.id.slot15as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot15as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot15as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot16")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot16as = findViewById<TextView>(R.id.slot16as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot16as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot16as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot17")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot17as = findViewById<TextView>(R.id.slot17as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot17as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot17as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot18")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot18as = findViewById<TextView>(R.id.slot18as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot18as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot18as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot19")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot19as = findViewById<TextView>(R.id.slot19as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot19as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot19as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot20")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot20as = findViewById<TextView>(R.id.slot20as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot20as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot20as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot21")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot21as = findViewById<TextView>(R.id.slot21as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot21as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot21as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot22")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot22as = findViewById<TextView>(R.id.slot22as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot22as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot22as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot23")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot23as = findViewById<TextView>(R.id.slot23as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot23as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot23as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot24")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot24as = findViewById<TextView>(R.id.slot24as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot24as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot24as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot25")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot19as = findViewById<TextView>(R.id.slot25as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot19as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot19as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot26")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot20as = findViewById<TextView>(R.id.slot26as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot20as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot20as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot27")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot21as = findViewById<TextView>(R.id.slot27as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot21as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot21as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot28")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot22as = findViewById<TextView>(R.id.slot28as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot22as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot22as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot29")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot23as = findViewById<TextView>(R.id.slot29as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot23as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot23as.setBackgroundResource(R.drawable.rectangle_red)
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
                database = FirebaseDatabase.getInstance()
                databaseReference = database?.reference!!.child("CoL Area").child("Slot30")
                databaseReference?.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val stat = snapshot.child("status").value.toString()
                        val slot30as = findViewById<TextView>(R.id.slot30as)
                        //val rectangle_red = ContextCompat.getDrawable(this@ConParking, R.drawable.rectangle_red)
                        if (stat == "avail") {
                            slot30as.setBackgroundResource(R.drawable.rectangle)
                        } else if (stat == "occupied") {
                            slot30as.setBackgroundResource(R.drawable.rectangle_red)
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
                val CoN1 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL1")
                val CoNlistener1 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot1.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot1").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot1").child("status").setValue("avail")
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
                val CoN2 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL2")
                val CoNlistener2 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot2.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot2").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot2").child("status").setValue("avail")
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
                val CoN3 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL3")
                val CoNlistener3 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot3.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot3").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot3").child("status").setValue("avail")
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
                val CoN4 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL4")
                val CoNlistener4 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot4.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot4").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot4").child("status").setValue("avail")
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
                val CoN5 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL5")
                val CoNlistener5 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot5.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot5").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot5").child("status").setValue("avail")
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
                val CoN6 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL6")
                val CoNlistener6 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot6.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot6").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot6").child("status").setValue("avail")
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
                val CoN7 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL7")
                val CoNlistener7 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot7.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot7").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot7").child("status").setValue("avail")
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
                val CoN8 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL8")
                val CoNlistener8 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot8.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot8").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot8").child("status").setValue("avail")
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
                val CoN9 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL9")
                val CoNlistener9 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot9.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot9").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot9").child("status").setValue("avail")
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
                val CoN10 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL10")
                val CoNlistener10 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot10.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot10").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot10").child("status").setValue("avail")
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
                val CoN11 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL11")
                val CoNlistener11 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot11.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot11").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot11").child("status").setValue("avail")
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
                val CoN12 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL12")
                val CoNlistener12 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot12.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot12").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot12").child("status").setValue("avail")
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
                val ordersRef = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL13")
                val valueEventListener = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot13.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot13").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot13").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                ordersRef.addListenerForSingleValueEvent(valueEventListener)

                val slot14 = findViewById<RelativeLayout>(R.id.slot14)
                val ordersReff = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL14")
                val valueEventListenerr = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot14.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot14").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot14").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                ordersReff.addListenerForSingleValueEvent(valueEventListenerr)

                val slot15 = findViewById<RelativeLayout>(R.id.slot15)
                val CoN15 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL15")
                val valueEventListenerrr = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot15.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot15").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot15").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN15.addListenerForSingleValueEvent(valueEventListenerrr)
                val slot16 = findViewById<RelativeLayout>(R.id.slot16)
                val CoN16 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL16")
                val valueEventListenerrrr = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot16.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot16").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot16").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN16.addListenerForSingleValueEvent(valueEventListenerrrr)

                val slot17 = findViewById<RelativeLayout>(R.id.slot17)
                val CoN17 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL17")
                val CoNlistener17 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot17.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot17").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot17").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN17.addListenerForSingleValueEvent(CoNlistener17)

                val slot18 = findViewById<RelativeLayout>(R.id.slot18)
                val CoN18 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL18")
                val CoNlistener18 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot18.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot18").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot18").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN18.addListenerForSingleValueEvent(CoNlistener18)

                val slot19 = findViewById<RelativeLayout>(R.id.slot19)
                val CoN19 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL19")
                val CoNlistener19 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot19.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot19").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot19").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN19.addListenerForSingleValueEvent(CoNlistener19)

                val slot20 = findViewById<RelativeLayout>(R.id.slot20)
                val CoN20 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL20")
                val CoNlistener20 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot20.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot20").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot20").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN20.addListenerForSingleValueEvent(CoNlistener20)

                val slot21 = findViewById<RelativeLayout>(R.id.slot21)
                val CoN21 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL21")
                val CoNlistener21 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot21.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot21").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot21").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN21.addListenerForSingleValueEvent(CoNlistener21)

                val slot22 = findViewById<RelativeLayout>(R.id.slot22)
                val CoN22 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL22")
                val CoNlistener22 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot22.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot22").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot22").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN22.addListenerForSingleValueEvent(CoNlistener22)

                val slot23 = findViewById<RelativeLayout>(R.id.slot23)
                val CoN23 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL23")
                val CoNlistener23 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot23.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot23").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot23").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN23.addListenerForSingleValueEvent(CoNlistener23)

                val slot24 = findViewById<RelativeLayout>(R.id.slot24)
                val CoN24 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL24")
                val CoNlistener24 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot24.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot24").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot24").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN24.addListenerForSingleValueEvent(CoNlistener24)
                val slot25 = findViewById<RelativeLayout>(R.id.slot25)
                val CoN25 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL25")
                val CoNlistener25 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot25.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot25").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot25").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN25.addListenerForSingleValueEvent(CoNlistener25)
                val slot26 = findViewById<RelativeLayout>(R.id.slot26)
                val CoN26 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL26")
                val CoNlistener26 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot26.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot26").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot26").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN26.addListenerForSingleValueEvent(CoNlistener26)
                val slot27 = findViewById<RelativeLayout>(R.id.slot27)
                val CoN27 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL27")
                val CoNlistener27 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot27.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot27").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot27").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN27.addListenerForSingleValueEvent(CoNlistener27)
                val slot28 = findViewById<RelativeLayout>(R.id.slot28)
                val CoN28 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL28")
                val CoNlistener28 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot28.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot28").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot28").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN28.addListenerForSingleValueEvent(CoNlistener28)
                val slot29 = findViewById<RelativeLayout>(R.id.slot29)
                val CoN29 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL29")
                val CoNlistener29 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot29.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot29").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot29").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN29.addListenerForSingleValueEvent(CoNlistener29)
                val slot30 = findViewById<RelativeLayout>(R.id.slot30)
                val CoN30 = rootRef.child("CoL Area").orderByChild("sid").equalTo("CoL30")
                val CoNlistener30 = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        for (ds in dataSnapshot.children) {
                            val stat = ds.child("status").getValue(String::class.java)
                            slot30.setOnClickListener(object : View.OnClickListener {
                                override fun onClick(view: View?) {
                                    val statchange = FirebaseDatabase.getInstance().reference
                                    if (stat.equals("avail")) {
                                        statchange.child("CoL Area").child("Slot30").child("status").setValue("occupied")
                                    } else {
                                        statchange.child("CoL Area").child("Slot30").child("status").setValue("avail")
                                    }
                                }
                            })
                        }
                    }
                    override fun onCancelled(databaseError: DatabaseError) {
                    }
                }
                CoN30.addListenerForSingleValueEvent(CoNlistener30)

            }
}



