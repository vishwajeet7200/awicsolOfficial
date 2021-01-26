package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc9 extends AppCompatActivity {
    ImageView learnImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc9);

        learnImg = findViewById(R.id.imageView15);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/learning.png?alt=media&token=d956cfef-2789-4fe4-8c05-169286a1e1f7").placeholder(R.drawable.androdef).into(learnImg);
    }
}