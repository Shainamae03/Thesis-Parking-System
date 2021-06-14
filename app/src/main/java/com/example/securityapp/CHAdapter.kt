package com.example.securityapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class CHAdapter(private val clientlog:ArrayList<User>) : RecyclerView.Adapter<CHAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.client_item,parent,false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem = clientlog[position]

    }

    override fun getItemCount(): Int {
        return clientlog.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }
}
