package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import flats.Room67;
import flats.Room75;
import flats.Room79;

public class Tworoomactivity extends AppCompatActivity {
    private AnimationDrawable mAnimationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tworoomactivity);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewfon);
        imageView.setBackgroundResource(R.drawable.fon);

        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        mAnimationDrawable.start();
    }
    public void openSN (View view) {
        Intent intent = new Intent(this, Room79.class);
        startActivity(intent);
    }
    public void openSS(View view) {
        Intent intent = new Intent(this, Room67.class);
        startActivity(intent);
    }
    public void openSF(View view) {
        Intent intent = new Intent(this, Room75.class);
        startActivity(intent);
    }
}
