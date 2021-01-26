package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc11 extends AppCompatActivity {
    ImageView quizImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc11);

        quizImg = findViewById(R.id.imageView17);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/quiz.png?alt=media&token=4285815d-77a1-4310-9dd7-0807df2c9562").placeholder(R.drawable.androdef).into(quizImg);
    }
}