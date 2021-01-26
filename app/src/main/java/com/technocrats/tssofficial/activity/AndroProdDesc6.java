package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc6 extends AppCompatActivity {
    ImageView socialImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc6);

        socialImg = findViewById(R.id.imageView12);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/social.png?alt=media&token=83ecd153-6274-4dd9-890d-e60a1ccab446").placeholder(R.drawable.androdef).into(socialImg);
    }
}