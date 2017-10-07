package com.example.brandon.bisonevents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brandon on 10/7/2017.
 */

public class eventAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<Event> mSource;

    public eventAdapter(Context context){
        mContext = context;
        mSource = new ArrayList<>();
        mInflater= (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setItems(List<Event> eventList){
        mSource.clear();
        mSource.addAll(eventList);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mSource.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Event event = mSource.get(i);
        String location = event.getLocation();
        String time = event.getTime();
        String title = event.getTitle();
        String description = event.getDescription();

        View rowView = mInflater.inflate(R.layout.event_item, viewGroup, false);
        TextView locationText = (TextView)rowView.findViewById(R.id.Location);
        TextView timeText = (TextView)rowView.findViewById(R.id.Time);
        TextView titleText = (TextView)rowView.findViewById(R.id.Title);
        TextView DescriptionText = (TextView)rowView.findViewById(R.id.Description);

        locationText.setText("Location: " + location);
        timeText.setText("Time: " + time);
        titleText.setText(title);
        DescriptionText.setText("Description: " + description);
        return rowView;
    }
}
