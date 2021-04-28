package com.example.vlad_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vlad_project.MyHolder;
import com.example.vlad_project.R;

public class Adapter75 extends RecyclerView.Adapter<MyHolder> {

    private Context context;
    private Integer[] imagesss = {  R.drawable.int75,R.drawable.p751,R.drawable.p752,R.drawable.p753,R.drawable.p756,R.drawable.p755,R.drawable.p757};
    public Adapter75(Context context) {
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
        return 7;
    }
}