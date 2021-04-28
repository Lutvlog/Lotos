package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import flats.Room43;
import flats.Room67;
import flats.Room75;
import flats.Room79;
import flats.Room99;

public class Planirovki extends AppCompatActivity {
    private TextView mTextView;
    TextView textView;
    SeekBar seekBar;
    int progresss;
    private AnimationDrawable mAnimationDrawable;

    public Planirovki() throws ClassNotFoundException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planirovki);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewfon);
        imageView.setBackgroundResource(R.drawable.fon);

        mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
        mAnimationDrawable.start();

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.txtView);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView.setText(String.valueOf(progress+43+ " "+"Квадратных метров"));
                progresss = progress + 43;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
    }
    public void openTRI(View view) {
        Intent intent = new Intent(this, Threeroomactivity.class);
        startActivity(intent);
    }
    public void openOne(View view) {
        Intent intent = new Intent(this, Oneroomactivity.class);
        startActivity(intent);
    }
    public void opentTwo(View view) {
        Intent intent = new Intent(this, Tworoomactivity.class);
        startActivity(intent);
    }

    public void openflat(View view) {
        if (progresss < 55) {
            Intent intent = new Intent(this, Room43.class);
            startActivity(intent);
        }
       else if(progresss >= 55 & progresss < 70) {
            Intent intent = new Intent(this, Room67.class);
            startActivity(intent);
        }
        else if(progresss >= 70 & progresss < 76) {
            Intent intent = new Intent(this, Room75.class);
            startActivity(intent);
        }
        else  if(progresss >= 76 & progresss < 85) {
            Intent intent = new Intent(this, Room79.class);
            startActivity(intent);
        }
        else  if(progresss >= 85 ) {
            Intent intent = new Intent(this, Room99.class);
            startActivity(intent);
        }

    }
    }
