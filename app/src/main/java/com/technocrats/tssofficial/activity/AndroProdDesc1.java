package com.technocrats.tssofficial.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;

public class AndroProdDesc1 extends AppCompatActivity {
    ImageView medImg, goBack;
    Button medBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andro_prod_desc1);

        medImg = findViewById(R.id.imageView7);
        goBack = findViewById(R.id.goBack);
        medBtn = findViewById(R.id.medBtn);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/doctor.png?alt=media&token=3d0d7fe5-0893-4394-b45c-349883437ec9").placeholder(R.drawable.androdef).into(medImg);

        medBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AndroProdDesc1.this, MedicalDetails.class);
                startActivity(intent);
            }
        });
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}