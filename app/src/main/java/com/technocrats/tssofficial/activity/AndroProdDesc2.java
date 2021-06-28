package com.technocrats.tssofficial.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc2 extends AppCompatActivity {
    ImageView tikImg, goBack;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc2);

        tikImg = findViewById(R.id.imageView8);
        button = findViewById(R.id.button2);
        goBack = findViewById(R.id.goBack);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AndroProdDesc2.this, TiktokDetails.class);
                startActivity(intent);
            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/tiktok.png?alt=media&token=f902ebc3-23cc-4cd7-a6c5-948c892377e3").placeholder(R.drawable.androdef).into(tikImg);
    }
}