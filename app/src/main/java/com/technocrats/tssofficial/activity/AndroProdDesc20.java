package com.technocrats.tssofficial.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc20 extends AppCompatActivity {
    ImageView beautyImg, goBack;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc20);

        beautyImg = findViewById(R.id.imageView25);
        goBack = findViewById(R.id.goBack);
        button = findViewById(R.id.button2);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AndroProdDesc20.this, BeautyDetails.class);
                startActivity(intent);
            }
        });

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/shopping.png?alt=media&token=347290f1-55a0-4f16-b0d9-a876ae222537").placeholder(R.drawable.androdef).into(beautyImg);
    }
}