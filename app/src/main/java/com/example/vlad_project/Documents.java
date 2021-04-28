package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Documents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);

        TextView tv = (TextView) findViewById(R.id.textViewq);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://lotos-park.ru/upload/iblock/722/722cc43d0c8f95a8defa5b8db7eeb0d4.pdf";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        TextView tv2 = (TextView) findViewById(R.id.textVieww);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://lotos-park.ru/upload/iblock/40c/40cb935b79be2087de88e95007fc2a6a.pdf";
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse(url));
                startActivity(intent2);
            }
        });

        TextView tv3 = (TextView) findViewById(R.id.textViewe);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://lotos-park.ru/upload/iblock/db9/db982540ade9cd741fcdd627a611d6ce.pdf";
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse(url));
                startActivity(intent3);
            }
        });

    }
}
