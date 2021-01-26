package com.technocrats.tssofficial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.adapters.ProductAdapter6;
import com.technocrats.tssofficial.model.Products;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class TrendingFragment2 extends Fragment {
    View view;
    RecyclerView prodItemRecycler1;
    ProductAdapter6 productAdapter6;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_trending2, container, false);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(19, "Medical Application", "$ 17.00", R.drawable.w2));
        productsList.add(new Products(20, "TikTok Application", "$ 25.00", R.drawable.tiktok));
        productsList.add(new Products(21, "Shopping Application", "$ 17.00", R.drawable.shopping));
        productsList.add(new Products(22, "Beauty Application", "$ 25.00", R.drawable.beauty));
        productsList.add(new Products(23, "Food Application", "$ 17.00", R.drawable.w3));
        productsList.add(new Products(24, "Tv Application", "$ 25.00", R.drawable.tvapp));
        productsList.add(new Products(25, "Video Calling App", "$ 17.00", R.drawable.video));
        productsList.add(new Products(26, "Social Media App", "$ 17.00", R.drawable.socialm));
        productsList.add(new Products(27, "Book Application", "$ 25.00", R.drawable.bookr));
        productsList.add(new Products(28, "Job Portal App", "$ 25.00", R.drawable.w5));
        productsList.add(new Products(29, "Learning Application", "$ 17.00", R.drawable.w6));
        productsList.add(new Products(30, "Messenger Application", "$ 17.00", R.drawable.messnger));
        productsList.add(new Products(31, "Quiz Application", "$ 25.00", R.drawable.quiz));
        productsList.add(new Products(32, "Photo Editor App", "$ 25.00", R.drawable.editing));
        productsList.add(new Products(33, "Wallpaper Application", "$ 25.00", R.drawable.wallpaper));
        productsList.add(new Products(34, "Music Player App", "$ 17.00", R.drawable.w4));
        productsList.add(new Products(35, "Media Player App", "$ 17.00", R.drawable.mediap));
        productsList.add(new Products(36, "Weather Application", "$ 25.00", R.drawable.w7));
        productsList.add(new Products(37, "Browser Application", "$ 17.00", R.drawable.browser));
        productsList.add(new Products(38, "Puzzle Application", "$ 25.00", R.drawable.puzzle));

        setProdItemRecycler1(productsList);

        return view;
    }
    private void setProdItemRecycler1(List<Products> productsList){

        prodItemRecycler1 = view.findViewById(R.id.product_recycler1);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        prodItemRecycler1.setLayoutManager(gridLayoutManager);
        productAdapter6 = new ProductAdapter6(getContext(), productsList);
        prodItemRecycler1.setAdapter(productAdapter6);

    }
}