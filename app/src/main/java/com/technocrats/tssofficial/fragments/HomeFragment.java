package com.technocrats.tssofficial.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.activity.AndroidActivity;
import com.technocrats.tssofficial.activity.CustomActivity;
import com.technocrats.tssofficial.activity.IosActivity;
import com.technocrats.tssofficial.activity.WebActivity;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {
    CarouselView carouselView;
    CardView android, web, ios, custom;
    TextView textViewUserName;
    private FirebaseAuth mAuth ;
    FirebaseUser currentUser;
    int[] sampleImages = {R.drawable.crousel1, R.drawable.crousel2, R.drawable.crousel3};
    public View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_home, container, false);

        carouselView = view.findViewById(R.id.carouselView);
        android = view.findViewById(R.id.android);
        web = view.findViewById(R.id.web);
        ios =view.findViewById(R.id.ios);
        textViewUserName = view.findViewById(R.id.headerLogo);
        custom = view.findViewById(R.id.customCard);

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        textViewUserName.setText("Hi "+currentUser.getDisplayName());
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AndroidActivity.class);
                startActivity(intent);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getContext(), WebActivity.class);
                startActivity(intent1);
            }
        });

        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getContext(), IosActivity.class);
                startActivity(intent2);
            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getContext(), CustomActivity.class);
                startActivity(intent3);
            }
        });
        return view;
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    };
}