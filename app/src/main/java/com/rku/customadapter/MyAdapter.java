package com.rku.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {

    private final Context context;
    private final ArrayList<Item> list;

    private final  int[] images = {
            R.drawable.ic_number_zero,
            R.drawable.ic_number_one,
            R.drawable.ic_number_two,
            R.drawable.ic_number_three,
            R.drawable.ic_number_four,
            R.drawable.ic_number_five,
            R.drawable.ic_number_six,
            R.drawable.ic_number_seven,
            R.drawable.ic_number_eight,
            R.drawable.ic_number_nine,
            R.drawable.ic_number_ten
    };
    MyAdapter(Context context, ArrayList<Item> list){
        super(context, R.layout.listitem,list);
        this.context =context;
        this.list =list;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.listitem,parent,false);

        //3. Get the two text view from the rawView
        TextView labelView = (TextView) rowView.findViewById(R.id.lable);
        TextView valueView = (TextView) rowView.findViewById(R.id.value);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imageView);

        //4. Set the text for texView

        labelView.setText(list.get(position).getTitle());
        valueView.setText(list.get(position).getDescription());
        imgView.setBackgroundResource(images[position]);

        //5. return rawView
        return rowView;
    }
}
