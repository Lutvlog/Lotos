package com.example.vlad_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vlad_project.MyHolder;
import com.example.vlad_project.R;

public class Adapter79 extends RecyclerView.Adapter<MyHolder> {

    private Context context;
    private Integer[] imagesss = {  R.drawable.int79,R.drawable.p791,R.drawable.p792,R.drawable.p793,R.drawable.p794,R.drawable.p795,R.drawable.p796,R.drawable.p797};
    public Adapter79(Context context) {
        this.context=context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.cell_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.Imagess.setImageResource(imagesss[position]);

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}