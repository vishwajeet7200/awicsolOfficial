package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc3 extends AppCompatActivity {
    ImageView foodImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc3);

        foodImg = findViewById(R.id.imageView9);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/food%20(1).png?alt=media&token=b9f1e68d-753f-4c47-805a-850d5f8d4b0e").placeholder(R.drawable.androdef).into(foodImg);
    }
}