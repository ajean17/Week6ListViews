package com.example.alvin.w6_d1_hw02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mainList;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainList = (ListView) findViewById(R.id.mainList);
        items = new ArrayList<String>();

        for(int i = 0; i < 5000; i++) {
            int itemNumber = i + 1;
            items.add("This is item "+ itemNumber);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.main_view_holder, R.id.tv_mainList, items);
        mainList.setAdapter(arrayAdapter);
    }

    public void toNext(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
