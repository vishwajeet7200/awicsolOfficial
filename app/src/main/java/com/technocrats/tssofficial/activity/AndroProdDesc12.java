package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc12 extends AppCompatActivity {
    ImageView editImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc12);

        editImg = findViewById(R.id.imageView18);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/editing.png?alt=media&token=a910094f-c463-4994-ab0a-ab3de6fa3710").placeholder(R.drawable.androdef).into(editImg);
    }
}