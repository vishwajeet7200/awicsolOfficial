package com.technocrats.tssofficial.adapters;

import com.technocrats.tssofficial.fragments.LatestFragment;
import com.technocrats.tssofficial.fragments.TrendingFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter {

    public PagerViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new LatestFragment();
                break;



            case 1:
                fragment= new TrendingFragment();
                break;



        }










        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
