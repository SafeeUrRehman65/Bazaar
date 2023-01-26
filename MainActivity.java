package com.example.bazaar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView= findViewById(R.id.listview1);
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Tomatoes");
        grocery.add("Potatoes");
        grocery.add("Spinach");
        grocery.add("garlic");
        grocery.add("lemon");
        grocery.add("Tea");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter(arrayAdapter);





    }
}