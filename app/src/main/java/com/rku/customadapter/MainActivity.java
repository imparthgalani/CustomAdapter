package com.rku.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lstData;
    String data[]= {"ABC","DEF","GHI","JKL"};
//  ArrayAdapter<String>adapter;
    ArrayList<Item> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData = findViewById(R.id.lstData);
        list = generateData();
        MyAdapter adapter =new MyAdapter(this, list);
        lstData.setAdapter(adapter);
      /*  adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                data
        );
        lstData.setAdapter(adapter);*/
    }

    private ArrayList<Item> generateData(){
        ArrayList<Item> items =new ArrayList<Item>();
        items.add(new Item("Item 0", "First Item on the list", R.drawable.ic_number_zero));
        items.add(new Item("Item 1", "First Item on the list", R.drawable.ic_number_one));
        items.add(new Item("Item 2", "Second Item on the list", R.drawable.ic_number_two));
        items.add(new Item("Item 3", "Third Item on the list", R.drawable.ic_number_three));
        items.add(new Item("Item 4", "Fore Item on the list", R.drawable.ic_number_four));
        items.add(new Item("Item 5", "Five Item on the list", R.drawable.ic_number_four));
        items.add(new Item("Item 6", "Six Item on the list", R.drawable.ic_number_six));
        items.add(new Item("Item 7", "Seven Item on the list", R.drawable.ic_number_seven));
        items.add(new Item("Item 8", "Eight Item on the list", R.drawable.ic_number_eight));
        items.add(new Item("Item 9", "Nine Item on the list", R.drawable.ic_number_nine));
        items.add(new Item("Item 10", "Tem Item on the list", R.drawable.ic_number_ten));
        return items;
    }
}