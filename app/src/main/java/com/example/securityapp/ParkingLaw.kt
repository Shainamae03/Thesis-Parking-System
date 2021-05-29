package com.example.securityapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ParkingLaw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_law)


        var s2  = 1

        val s1 = findViewById(R.id.s1) as Button;

         s1.setOnClickListener {
            if(s2==2){
                s1.setBackgroundResource(R.drawable.rectangle);
                    s2 = 1
            } else if(s2==1){
                s1.setBackgroundResource(R.drawable.ic_car_small);
                s2 =2;
            }
        }

    }
}


