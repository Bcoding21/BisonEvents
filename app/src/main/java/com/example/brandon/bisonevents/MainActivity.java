package com.example.brandon.bisonevents;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


import static android.R.id.list;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerList = (ListView)findViewById(R.id.navList);

        String[] osArray = { "ACM", "WHBC", "NSBE", "BLACKBURN", "CRAMPTON" };
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        /*ArrayList<String> Events = new ArrayList<>();
        Events.add("PARTY");
        Events.add("BIGGER PARTY");
        Events.add("BIGGEST PARTY");*/

        ListView listm = (ListView) findViewById(R.id.listView);

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

        ArrayAdapter adapter = new ArrayAdapter<Event>(this, android.R.layout.simple_list_item_1, eventsList);
        listm.setAdapter(adapter);}


}


