package com.example.vlad_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vlad_project.MyHolder;
import com.example.vlad_project.R;

public class Adapter438 extends RecyclerView.Adapter<MyHolder> {

    private Context context;
    private Integer[] imagesss = {R.drawable.int439, R.drawable.p438_1, R.drawable.p438_2,R.drawable.p438_3,R.drawable.p438_4,R.drawable.p438_5,};
    public Adapter438(Context context) {
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
        return 6;
    }
}