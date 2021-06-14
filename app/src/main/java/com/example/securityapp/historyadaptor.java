package com.example.securityapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.thesis.admin.data.History;

import org.jetbrains.annotations.NotNull;

class historyadaptor extends FirebaseRecyclerAdapter<History, historyadaptor.adminviewholder> {


    public historyadaptor(@NotNull FirebaseRecyclerOptions<History> options) {
        super(options);
    }

    @NonNull
    @NotNull
    @Override
    public adminviewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dtrclient,parent,false);

        return new adminviewholder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull adminviewholder holder,final int position, @NonNull History model) {
        holder.id.setText(model.getName());
        holder.adminname.setText(model.getPlateNumber());
        holder.date.setText(model.getDate());
        holder.code.setText(model.getSlot());

    }


    class adminviewholder extends RecyclerView.ViewHolder{
        TextView id, adminname, date, code;


        public adminviewholder(@NonNull View itemView){
            super(itemView);
            id = itemView.findViewById(R.id.id);
            adminname= itemView.findViewById(R.id.adminname);
            date= itemView.findViewById(R.id.date);
            code= itemView.findViewById(R.id.code);

        }
    }

}
