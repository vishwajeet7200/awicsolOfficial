package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc10 extends AppCompatActivity {
    ImageView msgImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc10);

        msgImg = findViewById(R.id.imageView16);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/messengr.png?alt=media&token=5f679a53-c84f-4c19-bd25-993c3ffb6d61").placeholder(R.drawable.androdef).into(msgImg);
    }
}