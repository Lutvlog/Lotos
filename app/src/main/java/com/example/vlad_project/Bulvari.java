package com.example.vlad_project;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;



public class Bulvari extends AppCompatActivity {
    private AnimationDrawable mAnimationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulvari);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewfon);
        imageView.setBackgroundResource(R.drawable.fon);

        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        mAnimationDrawable.start();
    }

        public void openImage (View view){
            Intent intent = new Intent(this, GalleryArcht.class);
            startActivity(intent);
        }
        public void openImage2 (View view){
            Intent intent = new Intent(this, GalleryBul.class);
            startActivity(intent);
        }
        public void openImage3 (View view){
            Intent intent = new Intent(this, interyeri.class);
            startActivity(intent);
        }
    }



