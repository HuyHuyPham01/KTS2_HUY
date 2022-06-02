package com.example.kiemtra_nhathuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button buttonThoat;
    ImageView imageViewKT1,imageViewKT2,imageViewKT3,imageViewKT4,imageViewKT5,imageViewKT6;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonThoat = findViewById(R.id.buttonThoat);
        imageViewKT1 = findViewById(R.id.imageViewKT1);
        imageViewKT2 = findViewById(R.id.imageViewKT2);
        imageViewKT3 = findViewById(R.id.imageViewKT3);
        imageViewKT4 = findViewById(R.id.imageViewKT4);
        imageViewKT5 = findViewById(R.id.imageViewKT5);
        imageViewKT6 = findViewById(R.id.imageViewKT6);

        buttonThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imageViewKT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,MainActivity_KT1.class);
                startActivity(i);
            }
        });

        imageViewKT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,MainActivity_KT2.class);
                startActivity(i);
            }
        });

        imageViewKT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imageViewKT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imageViewKT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imageViewKT6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}