package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable mAnimationDrawable;
    private AnimationDrawable mAnimationDrawable2;
    private AnimationDrawable mAnimationDrawable3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewfon);
        imageView.setBackgroundResource(R.drawable.fon);

        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        mAnimationDrawable.start();

        ImageView imageView2 = (ImageView) findViewById(R.id.imageViewline11);
        imageView2.setBackgroundResource(R.drawable.linesun);

        mAnimationDrawable2 = (AnimationDrawable) imageView2.getBackground();
        mAnimationDrawable2.start();

        ImageView imageView3 = (ImageView) findViewById(R.id.imageViewline12);
        imageView3.setBackgroundResource(R.drawable.linesunback);

        mAnimationDrawable3 = (AnimationDrawable) imageView3.getBackground();
        mAnimationDrawable3.start();



}
    public void openNews(View view) {
        Intent intent = new Intent(this, News.class);
        startActivity(intent);
    }
    public void openFlats(View view) {
        Intent intent = new Intent(this, Planirovki.class);
        startActivity(intent);
    }
    public void openinfrastructure(View view) {
        Intent intent = new Intent(this, infrastucture.class);
        startActivity(intent);
    }
    public void openDolshiki(View view) {
        Intent intent = new Intent(this, Dolshiki.class);
        startActivity(intent);
    }
    public void openBulvari(View view) {
        Intent intent = new Intent(this, Bulvari.class);
        startActivity(intent);
    }
    public void opentest(View view) {
        Intent intent = new Intent(this, Documents.class);
        startActivity(intent);
    }
    public void opensocial(View view) {
        Intent intent = new Intent(this, Social.class);
        startActivity(intent);
    }


}
