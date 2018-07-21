package com.example.root.musicalstructureaa;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class songAdapter extends ArrayAdapter<song> {


    private Context mContext;
    private List<song> moviesList = new ArrayList<>();

    public songAdapter(Context context, ArrayList<song> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        song currentMovie = moviesList.get(position);

        ImageView image = listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentMovie.getmImageDrawable());
        TextView name = listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        TextView release = listItem.findViewById(R.id.textView_release);
        release.setText(currentMovie.getmRelease());

        return listItem;
    }
}
