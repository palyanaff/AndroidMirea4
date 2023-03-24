package ru.palyanaff.androidmirea4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    private ListView listView;
    private static final String TAG = "ListFragment";
    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = view.findViewById(R.id.list_view);
        ArrayList<OrderItem> list = new ArrayList<>();
        for (int i = 0; i < 67; i++){
            list.add(new OrderItem(R.drawable.coffee_latte, getString(R.string.latte),
                    getString(R.string.latte_description), getString(R.string.latte_price)));
            list.add(new OrderItem(R.drawable.pizza_pepperoni, getString(R.string.pepperoni),
                    getString(R.string.pizza_description), getString(R.string.pizza_price)));
            list.add(new OrderItem(R.drawable.sushi, getString(R.string.sushi),
                    getString(R.string.sushi_description), getString(R.string.sushi_price)));
        }

        ListAdapter adapter = new ListAdapter(getActivity(), R.layout.items, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Log.i(TAG, "Item: " + position);
                Toast.makeText(getContext(), "Click", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}