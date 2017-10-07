package com.example.brandon.bisonevents;

/**
 * Created by Brandon on 10/7/2017.
 */

public class Event{
    private String mLocation;
    private String mTime;
    private String mTitle;
    private String mDescription;

    Event(String location, String time, String title, String description){
        mLocation = location;
        mTime = time;
        mTitle = title;
        mDescription = description;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getTime() {
        return mTime;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }
}
