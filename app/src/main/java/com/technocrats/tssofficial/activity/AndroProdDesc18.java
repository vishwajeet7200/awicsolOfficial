package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc18 extends AppCompatActivity {
    ImageView puzzleImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc18);

        puzzleImg = findViewById(R.id.imageView23);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/puzzle.png?alt=media&token=7c35c7f5-d883-4e3f-baa1-f9b90d39554e").placeholder(R.drawable.androdef).into(puzzleImg);
    }
}