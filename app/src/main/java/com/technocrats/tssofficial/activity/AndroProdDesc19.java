package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc19 extends AppCompatActivity {
    ImageView shopImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc19);

        shopImg = findViewById(R.id.imageView24);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/Asset%2019-8.png?alt=media&token=326fec5d-82ce-45e6-a843-501beedf46fd").placeholder(R.drawable.androdef).into(shopImg);
    }
}