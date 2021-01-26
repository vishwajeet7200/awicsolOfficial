package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc20 extends AppCompatActivity {
    ImageView beautyImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc20);

        beautyImg = findViewById(R.id.imageView25);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/shopping.png?alt=media&token=347290f1-55a0-4f16-b0d9-a876ae222537").placeholder(R.drawable.androdef).into(beautyImg);
    }
}