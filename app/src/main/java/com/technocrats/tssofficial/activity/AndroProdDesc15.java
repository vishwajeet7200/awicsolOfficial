package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc15 extends AppCompatActivity {
    ImageView playerImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc15);

        playerImg = findViewById(R.id.imageView21);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/vidplayer.png?alt=media&token=593ac066-4d28-4020-aeea-ebb0627cfc99").placeholder(R.drawable.androdef).into(playerImg);
    }
}