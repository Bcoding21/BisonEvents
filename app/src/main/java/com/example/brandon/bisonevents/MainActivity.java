package com.example.brandon.bisonevents;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String[] event1Array = res.getStringArray(R.array.Event1);
        String[] event2Array = res.getStringArray(R.array.Event2);
        String[] event3Array = res.getStringArray(R.array.Event3);
        String[] event4Array = res.getStringArray(R.array.Event4);
        String[] event5Array = res.getStringArray(R.array.Event5);

        List<String[]> eventArrayList = new ArrayList<String[]>();
        eventArrayList.add(event1Array);
        eventArrayList.add(event2Array);
        eventArrayList.add(event3Array);
        eventArrayList.add(event4Array);
        eventArrayList.add(event5Array);

        List<Event> eventsList = new ArrayList<Event>();
        for (String[] eventArray : eventArrayList){
            eventsList.add(new Event(eventArray[0], eventArray[1], eventArray[3], eventArray[2]));
        }
    }


}
