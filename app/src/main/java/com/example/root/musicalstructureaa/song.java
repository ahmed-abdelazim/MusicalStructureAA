package com.example.root.musicalstructureaa;

public class song {

    // Store the id of the  song poster
    private int mImageDrawable;
    // Store the name of the song
    private String mName;
    // Store the release year of the song
    private String mRelease;


    // Constructor that is used to create an instance of the song object
    public song(int mImageDrawable, String mName, String mRelease) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mRelease = mRelease;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }

}
