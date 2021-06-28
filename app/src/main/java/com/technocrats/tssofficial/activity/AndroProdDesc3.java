package com.technocrats.tssofficial.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc3 extends AppCompatActivity {
    ImageView foodImg, goBack;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc3);

        foodImg = findViewById(R.id.imageView9);
        button = findViewById(R.id.button2);
        goBack = findViewById(R.id.goBack);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AndroProdDesc3.this, FoodDetails.class);
                startActivity(intent);
            }
        });

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/food%20(1).png?alt=media&token=b9f1e68d-753f-4c47-805a-850d5f8d4b0e").placeholder(R.drawable.androdef).into(foodImg);
    }
}