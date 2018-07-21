package com.example.root.musicalstructureaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        moviesList.add(new song(R.drawable.qalby, "After Earth" , "2013"));
        moviesList.add(new song(R.drawable.qalby, "Baby Driver" , "2017"));
        moviesList.add(new song(R.drawable.qalby, "Deadpool" , "2016"));
        moviesList.add(new song(R.drawable.qalby, "Divergent" , "2014"));
        moviesList.add(new song(R.drawable.qalby, "Fight Club" , "1999"));
        moviesList.add(new song(R.drawable.qalby, "Jaws" , "1975"));
        moviesList.add(new song(R.drawable.qalby, "Pirates of the Caribbean" , "2011"));
        moviesList.add(new song(R.drawable.qalby, "Star Wars" , "2016"));
        moviesList.add(new song(R.drawable.qalby, "The Grey" , "2011"));

        mAdapter = new songAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

    }
}
