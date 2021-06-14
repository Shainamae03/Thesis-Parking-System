package com.example.securityapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import org.jetbrains.annotations.NotNull;

class guestadaptor extends FirebaseRecyclerAdapter<Guestss, guestadaptor.adminviewholder> {


    public guestadaptor(@NotNull FirebaseRecyclerOptions<Guestss> options) {
        super(options);
    }

    @NonNull
    @NotNull
    @Override
    public adminviewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adminrecyclerview,parent,false);

        return new adminviewholder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull adminviewholder holder,final int position, @NonNull Guestss model) {
        holder.adminname.setText(model.getName());
        holder.id.setText(model.getPlateNumber());
        holder.emailad.setText(model.getVehicle());
        holder.code.setText(model.getReason());
        holder.datee.setText(model.getDate());

    }


    class adminviewholder extends RecyclerView.ViewHolder{
        TextView id, adminname, datee, emailad, code;


        public adminviewholder(@NonNull View itemView){
            super(itemView);
            id = itemView.findViewById(R.id.id);
            adminname= itemView.findViewById(R.id.adminname);
            datee= itemView.findViewById(R.id.datee);
            code= itemView.findViewById(R.id.code);
            emailad = itemView.findViewById(R.id.emailad);
        }
    }

}
