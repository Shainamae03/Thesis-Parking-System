package com.example.securityapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Guestlog extends AppCompatActivity {

    RecyclerView recyclerView;
    guestadaptor adminadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guestlog);

        recyclerView = findViewById(R.id.clientlisthistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Guestss> options =
                new FirebaseRecyclerOptions.Builder<Guestss>()
                        .setQuery(FirebaseDatabase.getInstance().getReference("GuestLogs"), Guestss.class)
                        .build();

        adminadapter = new guestadaptor(options);
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
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search, menu);
        MenuItem item = menu.findItem(R.id.searchbar);
        SearchView searchView = (SearchView) item.getActionView();

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
        FirebaseRecyclerOptions<Guestss> options =
                new FirebaseRecyclerOptions.Builder<Guestss>()
                        .setQuery(FirebaseDatabase.getInstance().getReference("GuestLogs").orderByChild("PlateNumber").startAt(str).endAt(str + "~"), Guestss.class)
                        .build();

        adminadapter = new guestadaptor(options);
        adminadapter.startListening();
        recyclerView.setAdapter(adminadapter);
    }

}