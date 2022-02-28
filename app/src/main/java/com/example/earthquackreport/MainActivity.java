package com.example.earthquackreport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<QuackReport> arr = QueryUtils.extractEarthquakes();

//        arr.add(new QuackReport("7.1'", "Japan", "3:00pm"));
//        arr.add(new QuackReport("7.1'", "Japan", "3:00pm"));
//        arr.add(new QuackReport("7.1'", "Japan", "3:00pm"));
//        arr.add(new QuackReport("7.1'", "Japan", "3:00pm"));
//        arr.add(new QuackReport("7.1'", "Japan", "3:00pm"));

        QuackReportAdapter quackReportAdapter = new QuackReportAdapter(this, arr);

        ListView quackListView = findViewById(R.id.listView);

        // set the numbersViewAdapter for ListView
        quackListView.setAdapter(quackReportAdapter);

        quackListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Find the current earthquake that was clicked on
                QuackReport currentEarthquake = quackReportAdapter.getItem(position);

                // Convert the String URL into a URI object (to pass into the Intent constructor)
                Uri earthquakeUri = Uri.parse(currentEarthquake.getUrl());

                // Create a new intent to view the earthquake URI
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);

                // Send the intent to launch a new activity
                startActivity(websiteIntent);
            }
        });

    }
}