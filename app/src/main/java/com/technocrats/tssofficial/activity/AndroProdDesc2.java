package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc2 extends AppCompatActivity {
    ImageView tikImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc2);

        tikImg = findViewById(R.id.imageView8);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/tiktok.png?alt=media&token=f902ebc3-23cc-4cd7-a6c5-948c892377e3").placeholder(R.drawable.androdef).into(tikImg);
    }
}