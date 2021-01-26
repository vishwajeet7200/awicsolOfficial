package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc17 extends AppCompatActivity {
    ImageView browserImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc17);

        browserImg = findViewById(R.id.imageView22);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/browser.png?alt=media&token=4b6eac65-e239-4cf1-92d3-51802800d15f").placeholder(R.drawable.androdef).into(browserImg);
    }
}