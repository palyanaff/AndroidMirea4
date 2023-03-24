package ru.palyanaff.androidmirea4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<OrderItem> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<OrderItem> items;

    public ListAdapter(Context context, int resource, ArrayList<OrderItem> list) {
        super(context, resource, list);
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);
        ImageView imageView = view.findViewById(R.id.item_image);
        TextView header = view.findViewById(R.id.item_name);
        TextView description = view.findViewById(R.id.item_description);
        Button button = view.findViewById(R.id.item_button);

        imageView.setImageResource(getItem(position).getImage());
        header.setText(getItem(position).getHeader());
        description.setText(getItem(position).getDescription());
        button.setText(getItem(position).getCost());

        return view;
    }
}
