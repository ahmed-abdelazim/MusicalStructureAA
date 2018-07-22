package com.example.root.musicalstructureaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class Qalby extends AppCompatActivity {


    private ListView listView;
    private songAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        listView = findViewById(R.id.movies_list);
        ArrayList<song> moviesList = new ArrayList<>();
        moviesList.add(new song(R.drawable.qalby, "Song 1" , "2013"));
        moviesList.add(new song(R.drawable.qalby, "Song 2" , "2017"));
        moviesList.add(new song(R.drawable.qalby, "Song 3" , "2016"));
        moviesList.add(new song(R.drawable.qalby, "Song 4" , "2014"));
        moviesList.add(new song(R.drawable.qalby, "Song 5" , "1999"));
        moviesList.add(new song(R.drawable.qalby, "Song 6" , "1975"));
        moviesList.add(new song(R.drawable.qalby, "Song 7" , "2011"));
        moviesList.add(new song(R.drawable.qalby, "Song 8" , "2016"));
        moviesList.add(new song(R.drawable.qalby, "Song 9" , "2011"));

        mAdapter = new songAdapter(this,moviesList);
        listView.setAdapter(mAdapter);
        Button qalby = findViewById(R.id.qalbyButton);
        qalby.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Haneeny Activity}
                Intent qalbyIntent = new Intent(getApplicationContext(), Qalby.class);

                // Start the new activity
                startActivity(qalbyIntent);}
        });

        Button oyoon = findViewById(R.id.oyoonButton);
        oyoon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Haneeny Activity}
                Intent oyoonIntent = new Intent(getApplicationContext(), Oyoon.class);

                // Start the new activity
                startActivity(oyoonIntent);}
        });

        Button haneeny = findViewById(R.id.haneenyButton);
        haneeny.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Haneeny Activity}
                Intent haneenyIntent = new Intent(getApplicationContext(), Haneeny.class);

                // Start the new activity
                startActivity(haneenyIntent);}
        });

        Button home = findViewById(R.id.HomeButton);
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Haneeny Activity}
                Intent homeIntent = new Intent(getApplicationContext(), MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);}
        });

    }
}
