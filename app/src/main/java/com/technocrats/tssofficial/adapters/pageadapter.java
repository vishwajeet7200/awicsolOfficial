package com.technocrats.tssofficial.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.technocrats.tssofficial.activity.login;
import com.technocrats.tssofficial.activity.signup;

public class pageadapter extends FragmentPagerAdapter {

    int tabcount;
    public pageadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new login();
            case 1 : return new signup();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
