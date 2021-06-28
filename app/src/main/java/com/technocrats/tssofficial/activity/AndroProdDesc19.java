package com.technocrats.tssofficial.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc19 extends AppCompatActivity {
    ImageView shopImg, goBack;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc19);

        shopImg = findViewById(R.id.imageView24);
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
                Intent intent = new Intent(AndroProdDesc19.this, ShoppingDetails.class);
                startActivity(intent);
            }
        });

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/Asset%2019-8.png?alt=media&token=326fec5d-82ce-45e6-a843-501beedf46fd").placeholder(R.drawable.androdef).into(shopImg);
    }
}