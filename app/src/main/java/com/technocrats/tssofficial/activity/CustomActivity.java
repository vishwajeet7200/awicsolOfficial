package com.technocrats.tssofficial.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CustomActivity extends AppCompatActivity {
    Button detailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        detailBtn = findViewById(R.id.detailBtn);
        Toolbar toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Custom Section");

        detailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();
            }
        });
    }
    private void sendEmail() {
        String[] TO_EMAILS = {"technocrats.developer@gmail.com"};

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, TO_EMAILS);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of your Idea");
        intent.putExtra(Intent.EXTRA_TEXT, "Write down your ideas here or upload image");

        startActivity(Intent.createChooser(intent, "Choose your email client"));

    }
}