package com.example.vlad_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vlad_project.MyHolder;
import com.example.vlad_project.R;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private Context context;
    private Integer[] imagesss = { R.drawable.arc1, R.drawable.arc2, R.drawable.arc4, R.drawable.arc5, R.drawable.arc6, R.drawable.arc7, R.drawable.arc8, R.drawable.arc8, R.drawable.arc9, R.drawable.arc10, R.drawable.arc11, R.drawable.arc12, R.drawable.arc13, R.drawable.arc14, R.drawable.arc15};
    public MyAdapter(Context context) {
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
        return 14;
    }
}