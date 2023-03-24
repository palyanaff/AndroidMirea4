package ru.palyanaff.androidmirea4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private LayoutInflater inflater;
    private ArrayList<OrderItem> list;

    RecyclerAdapter(Context context, ArrayList<OrderItem> list){
        this.inflater = LayoutInflater.from(context);
        this.list = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        OrderItem item = list.get(position);
        holder.imageView.setImageResource(item.getImage());
        holder.header.setText(item.getHeader());
        holder.description.setText(item.getDescription());
        holder.button.setText(item.getCost());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView header;
        TextView description;
        Button button;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_image);
            header = itemView.findViewById(R.id.item_name);
            description = itemView.findViewById(R.id.item_description);
            button = itemView.findViewById(R.id.item_button);
        }
    }
}
