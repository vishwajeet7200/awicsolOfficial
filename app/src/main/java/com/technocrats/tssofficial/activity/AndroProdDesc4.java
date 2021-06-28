package com.technocrats.tssofficial.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc4 extends AppCompatActivity {
    ImageView tvImg, goBack;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc4);

        tvImg = findViewById(R.id.imageView10);
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
                Intent intent = new Intent(AndroProdDesc4.this, TvDetails.class);
                startActivity(intent);
            }
        });

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/tv.png?alt=media&token=9e98a899-d61b-4a69-99a8-103f61926e95").placeholder(R.drawable.androdef).into(tvImg);
    }
}