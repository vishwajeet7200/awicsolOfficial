package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc4 extends AppCompatActivity {
    ImageView tvImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc4);

        tvImg = findViewById(R.id.imageView10);
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/tv.png?alt=media&token=9e98a899-d61b-4a69-99a8-103f61926e95").placeholder(R.drawable.androdef).into(tvImg);
    }
}