package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import flats.Room43;
import flats.Room435;
import flats.Room99;

public class Threeroomactivity extends AppCompatActivity {
    private AnimationDrawable mAnimationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threeroomactivity);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewfon);
        imageView.setBackgroundResource(R.drawable.fon);

        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        mAnimationDrawable.start();
    }
    public void openNN (View view) {
        Intent intent = new Intent(this, Room99.class);
        startActivity(intent);
    }
}
