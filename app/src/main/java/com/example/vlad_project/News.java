package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class News extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    public void news1 (View view) {
        Intent intent = new Intent(this, News2.class);
        startActivity(intent);
    }

    public void news2 (View view) {
        Intent intent = new Intent(this, News1.class);
        startActivity(intent);
    }
}
