package com.example.brandon.bisonevents;


import android.widget.ListView;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;
import static java.security.AccessController.getContext;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Event> mEventsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        mEventsList = new ArrayList<Event>();
        for (String[] eventArray : eventArrayList) {
            mEventsList.add(new Event(eventArray[0], eventArray[1], eventArray[3], eventArray[2]));
        }

        eventAdapter adapter = new eventAdapter(this);
        adapter.setItems(mEventsList);
        listm.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        final SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //String search = searchView.getQuery().toString().toLowerCase();//stores the search quer
                String search = query.toLowerCase();
                List<Event> newList = new ArrayList<>();// list that contains the relevant search results
                for (Event arr : mEventsList) {
                    if(arr.getTitle().toLowerCase().contains(search.toLowerCase())){
                        newList.add(arr);
                    }
                    /*else{
                        Toast toast = Toast.makeText(getApplicationContext(), "nope", Toast.LENGTH_SHORT);
                        toast.show();
                    }*/
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
