package com.example.brandon.bisonevents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by purea on 10/7/2017.
 */

public class AddEvent extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        final EditText title = (EditText) findViewById(R.id.Title);
        final EditText time = (EditText) findViewById(R.id.Time);
        final EditText location = (EditText) findViewById(R.id.Location);
        final EditText description = (EditText) findViewById(R.id.Description2);



        Button add_event = (Button) findViewById(R.id.add_event);
        add_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);

               // Event newEvent = new Event(description.getText().toString(), time.getText().toString(), title.getText().toString(), location.getText().toString());
                intent.putExtra("Description", description.getText().toString());
                intent.putExtra("Time", time.getText().toString());
                intent.putExtra("Title", title.getText().toString());
                intent.putExtra("Location", location.getText().toString());
                startActivity(intent);
            }
        });


    }

}
