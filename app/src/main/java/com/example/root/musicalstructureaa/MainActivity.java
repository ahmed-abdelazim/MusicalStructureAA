package com.example.root.musicalstructureaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView haneeny = findViewById(R.id.haneeny);

        // Set a click listener on that View
        haneeny.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Haneeny Album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Haneeny Activity}
                Intent haneenyIntent = new Intent(MainActivity.this, Haneeny.class);

                // Start the new activity
                startActivity(haneenyIntent);
            }
        });

        ImageView oyoon = findViewById(R.id.oyoon);
        // Set a click listener on that View
        oyoon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Oyoon Album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Oyoon Activity}
                Intent OyoonIntent = new Intent(MainActivity.this, Oyoon.class);

                // Start the new activity
                startActivity(OyoonIntent);
            }
        });
        ImageView qalby = findViewById(R.id.qalby);
        // Set a click listener on that View
        qalby.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Qalby Album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Qalby Activity}
                Intent qalbyIntent = new Intent(MainActivity.this, Qalby.class);

                // Start the new activity
                startActivity(qalbyIntent);
            }
        });
    }
}
