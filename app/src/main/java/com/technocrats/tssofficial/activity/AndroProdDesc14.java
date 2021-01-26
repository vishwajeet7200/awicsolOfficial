package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc14 extends AppCompatActivity {
    ImageView musicImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc14);

        musicImg = findViewById(R.id.imageView20);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/music.png?alt=media&token=e0c11786-55ac-4f6a-9dc7-d60a2186fec0").placeholder(R.drawable.androdef).into(musicImg);
    }
}