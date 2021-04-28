package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class interyeri extends AppCompatActivity {

    private AnimationDrawable mAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interyeri);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewfon);
        imageView.setBackgroundResource(R.drawable.fon);

        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        mAnimationDrawable.start();
    }
    public void op43(View view) {
        Intent intent = new Intent(this, Gal438.class);
        startActivity(intent);
    }
    public void op435(View view) {
        Intent intent = new Intent(this, Gal435.class);
        startActivity(intent);
    }
    public void op67(View view) {
        Intent intent = new Intent(this, Gal67.class);
        startActivity(intent);
    }
    public void op75(View view) {
        Intent intent = new Intent(this, Gal75.class);
        startActivity(intent);
    }
    public void op79(View view) {
        Intent intent = new Intent(this, Gal79.class);
        startActivity(intent);
    }
    public void op99(View view) {
        Intent intent = new Intent(this, Gal99.class);
        startActivity(intent);
    }
}