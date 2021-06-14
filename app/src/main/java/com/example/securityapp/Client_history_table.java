package com.example.securityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.example.securityapp.ClientAppTableLogs;


public class Client_history_table extends AppCompatActivity {

    RecyclerView recyclerView;
    clientlogstable adminadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_history_table);



        recyclerView = findViewById(R.id.clientlisthistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<ClientAppTableLogs> options =
                new FirebaseRecyclerOptions.Builder<ClientAppTableLogs>()
                        .setQuery(FirebaseDatabase.getInstance().getReference("ClientLogs"), ClientAppTableLogs.class)
                        .build();

        adminadapter = new clientlogstable(options);
        recyclerView.setAdapter(adminadapter);
    }
    @Override
    protected void onStart() {
        super.onStart();
        adminadapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adminadapter.stopListening();
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search, menu);
        MenuItem item = menu.findItem(R.id.searchbar);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                textsearch(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                textsearch(query);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    private void textsearch(String str) {
        FirebaseRecyclerOptions<ClientAppTableLogs> options =
                new FirebaseRecyclerOptions.Builder<ClientAppTableLogs>()
                        .setQuery(FirebaseDatabase.getInstance().getReference("ClientLogs").orderByChild("Name").startAt(str).endAt(str+"~"), ClientAppTableLogs.class)
                        .build();

        adminadapter = new clientlogstable(options);
        adminadapter.startListening();
        recyclerView.setAdapter(adminadapter);
    }
}