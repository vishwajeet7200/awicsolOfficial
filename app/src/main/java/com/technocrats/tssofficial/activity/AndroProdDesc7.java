package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc7 extends AppCompatActivity {
    ImageView bookImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc7);

        bookImg = findViewById(R.id.imageView13);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/books.png?alt=media&token=9b73e596-e4ce-45f1-8247-f050bac90f9e").placeholder(R.drawable.androdef).into(bookImg);
    }
}