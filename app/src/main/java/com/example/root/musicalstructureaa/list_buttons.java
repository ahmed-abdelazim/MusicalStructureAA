package com.example.root.musicalstructureaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class list_buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

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
