package com.technocrats.tssofficial.activity;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.fragments.ChatFragment;
import com.technocrats.tssofficial.fragments.HomeFragment;
import com.technocrats.tssofficial.fragments.ProfileFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation bottomNavigation;
    private final static int ID_HOME=1;
    private final static int ID_CHAT=2;
    private final static int ID_PROFILE=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.btNav);
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_chat));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_baseline_person_pin_24));

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                // your codes
            }
        });

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                // your codes
                Fragment select_fragment=null;
                switch (item.getId()){
                    case ID_HOME:
                        select_fragment = new HomeFragment();
                        break;
                    case ID_CHAT:
                        select_fragment = new ChatFragment();
                        break;
                    case ID_PROFILE:
                        select_fragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, select_fragment).commit();
            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                // your codes
            }
        });
    }
}