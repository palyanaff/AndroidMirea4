package ru.palyanaff.androidmirea4;

import android.os.Bundle;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {
    public RecyclerFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        ArrayList<OrderItem> list = new ArrayList<>();
        for (int i = 0; i < 67; i++){
            list.add(new OrderItem(R.drawable.coffee_latte, getString(R.string.latte),
                    getString(R.string.latte_description), getString(R.string.latte_price)));
            list.add(new OrderItem(R.drawable.pizza_pepperoni, getString(R.string.pepperoni),
                    getString(R.string.pizza_description), getString(R.string.pizza_price)));
            list.add(new OrderItem(R.drawable.sushi, getString(R.string.sushi),
                    getString(R.string.sushi_description), getString(R.string.sushi_price)));
        }
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}