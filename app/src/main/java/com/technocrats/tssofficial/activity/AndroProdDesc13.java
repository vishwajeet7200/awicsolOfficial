package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc13 extends AppCompatActivity {
    ImageView wallImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc13);

        wallImg = findViewById(R.id.imageView19);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/wallpaper.png?alt=media&token=a95f8b21-739d-4aa9-b640-5c06c4fc41f6").placeholder(R.drawable.androdef).into(wallImg);
    }
}