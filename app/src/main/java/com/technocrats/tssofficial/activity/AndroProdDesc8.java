package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc8 extends AppCompatActivity {
    ImageView jobImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc8);

        jobImg = findViewById(R.id.imageView14);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/job.png?alt=media&token=d022f845-bc0f-43cb-b957-42522b9135aa").placeholder(R.drawable.androdef).into(jobImg);
    }
}