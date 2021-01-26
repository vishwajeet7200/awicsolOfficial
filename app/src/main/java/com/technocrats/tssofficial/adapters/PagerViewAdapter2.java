package com.technocrats.tssofficial.adapters;

import com.technocrats.tssofficial.fragments.LatestFragment2;
import com.technocrats.tssofficial.fragments.TrendingFragment2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerViewAdapter2 extends FragmentPagerAdapter {
    public PagerViewAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new LatestFragment2();
                break;



            case 1:
                fragment= new TrendingFragment2();
                break;



        }










        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
