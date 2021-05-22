package com.example.securityapp

import android.annotation.TargetApi
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class ClientInfo : AppCompatActivity() {
    private lateinit var dbref: DatabaseReference
    private lateinit var clientlog: RecyclerView
    private lateinit var clientArrayList: ArrayList<User>

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

    clientlog = findViewById(R.id.clientlog)
    clientlog.layoutManager = LinearLayoutManager(this,)
    clientlog.setHasFixedSize(true)


    clientArrayList = arrayListOf()
    getUserData()


}

private fun getUserData() {
    dbref = FirebaseDatabase.getInstance().getReference("ClientDb")
    dbref.addValueEventListener(object : ValueEventListener {


        override fun onDataChange(snapshot: DataSnapshot) {
            if (snapshot.exists()) {
                for (userSnapshot in snapshot.children) {
                    val user = userSnapshot.getValue(User::class.java)
                    clientArrayList.add(user!!)
                }
            }
            clientlog.adapter = CHAdapter(clientArrayList)
        }

        override fun onCancelled(error: DatabaseError) {
            TODO("Not yet implemented")
        }

    })
}

}