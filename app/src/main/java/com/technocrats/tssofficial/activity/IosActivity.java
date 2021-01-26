package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.technocrats.tssofficial.adapters.PagerViewAdapter2;
import com.technocrats.tssofficial.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

public class IosActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TextView latest, trending;
    private PagerViewAdapter2 pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios);

        Toolbar toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ios App Section");

        latest=findViewById(R.id.latest);
        trending=findViewById(R.id.trending);

        viewPager=findViewById(R.id.FragmentContainer);

        latest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });



        pagerViewAdapter = new PagerViewAdapter2(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                onChangeTab(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }

    private void onChangeTab(int position) {

        if(position==0)
        {
            latest.setTextSize(25);
            trending.setTextSize(15);

        }
        if(position==1)
        {
            latest.setTextSize(15);
            trending.setTextSize(25);

        }

    }
}