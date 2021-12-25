package com.example.mapproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class truck_adapter extends RecyclerView.Adapter<truck_adapter.Viewholder> {
    private ArrayList<Example> dataSet;
    Context context;

    public truck_adapter(ArrayList<Example> dataSet, Context context) {
        this.dataSet = dataSet;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recylerview_item, parent, false);


        Viewholder myview = new Viewholder(view);
        return myview;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView truck_no,truck_speed,running_status,active_status;
        ImageView battery;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
