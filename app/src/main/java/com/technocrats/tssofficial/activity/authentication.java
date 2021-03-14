package com.technocrats.tssofficial.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.adapters.pageadapter;

public class authentication extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem login,signup;
    ViewPager viewPager;
    pageadapter pageadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);
        pageadapter= new pageadapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageadapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1)
                    pageadapter.notifyDataSetChanged();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
    }
