package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc5 extends AppCompatActivity {
    ImageView vidImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc5);

        vidImg = findViewById(R.id.imageView11);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/video.png?alt=media&token=7e48fbb2-ba1a-4aa6-9a2d-52390a1a4b15").placeholder(R.drawable.androdef).into(vidImg);
    }
}