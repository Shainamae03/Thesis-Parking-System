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


        var button_background: Int = 1;

        val s1 = findViewById(R.id.s1) as Button;
        val s2 = findViewById<Button>(R.id.s2)
        val s3 = findViewById(R.id.s3) as Button
        s1.setOnClickListener {
            if (button_background == 2) {
                s1.setBackgroundResource(R.drawable.rectangle);
                button_background = 1;
            } else if (button_background == 1) {
                s1.setBackgroundResource(R.drawable.ic_car_small);
                button_background = 2;


            }
            s2.setOnClickListener {
                if (button_background == 2) {
                    s2.setBackgroundResource(R.drawable.rectangle);
                    button_background = 1;
                } else if (button_background == 1) {
                    s2.setBackgroundResource(R.drawable.ic_car_small);
                    button_background = 2;
                }
                s3.setOnClickListener {
                    if (button_background == 2) {
                        s3.setBackgroundResource(R.drawable.rectangle);
                        button_background = 1;
                    } else if (button_background == 1) {
                        s3.setBackgroundResource(R.drawable.ic_car_small);
                        button_background = 2;
                    }
                }
            }
        }
    }
}


