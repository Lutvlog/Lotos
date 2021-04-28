package com.example.vlad_project;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {


    public ImageView Imagess;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        Imagess = itemView.findViewById(R.id.imageView11);
    }
}