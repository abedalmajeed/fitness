package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {
    String list[]={"1. Exercise Daily","2. Eat the Right Foods and Portion Each Meal","3. Keep Track of Calories and Food Intake Per Day","4. Be Sure to Get Sleep","5. Stay Motivated"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView=(ListView) findViewById(R.id.ListView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

    }
}

