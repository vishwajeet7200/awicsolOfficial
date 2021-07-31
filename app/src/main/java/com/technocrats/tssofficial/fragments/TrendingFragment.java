package com.technocrats.tssofficial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.adapters.ProductAdapter2;
import com.technocrats.tssofficial.model.Products;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class TrendingFragment extends Fragment {
    View view;
    RecyclerView prodItemRecycler1;
    ProductAdapter2 productAdapter2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //just for commit
        view = inflater.inflate(R.layout.fragment_trending, container, false);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Medical Application", "$ 17.00", R.drawable.w2));
        productsList.add(new Products(2, "TikTok Application", "$ 25.00", R.drawable.tiktok));
        productsList.add(new Products(3, "Shopping Application", "$ 17.00", R.drawable.shopping));
        productsList.add(new Products(4, "Beauty Application", "$ 25.00", R.drawable.beauty));
        productsList.add(new Products(5, "Food Application", "$ 17.00", R.drawable.w3));
        productsList.add(new Products(6, "Tv Application", "$ 25.00", R.drawable.tvapp));
        productsList.add(new Products(7, "Video Calling App", "$ 17.00", R.drawable.video));
        productsList.add(new Products(8, "Social Media App", "$ 17.00", R.drawable.socialm));
        productsList.add(new Products(9, "Book Application", "$ 25.00", R.drawable.bookr));
        productsList.add(new Products(10, "Job Portal App", "$ 25.00", R.drawable.w5));
        productsList.add(new Products(11, "Learning Application", "$ 17.00", R.drawable.w6));
        productsList.add(new Products(12, "Messenger Application", "$ 17.00", R.drawable.messnger));
        productsList.add(new Products(13, "Quiz Application", "$ 25.00", R.drawable.quiz));
        productsList.add(new Products(14, "Photo Editor App", "$ 25.00", R.drawable.editing));
        productsList.add(new Products(15, "Wallpaper Application", "$ 25.00", R.drawable.wallpaper));
        productsList.add(new Products(16, "Music Player App", "$ 17.00", R.drawable.w4));
        productsList.add(new Products(17, "Media Player App", "$ 17.00", R.drawable.mediap));
        productsList.add(new Products(18, "Weather Application", "$ 25.00", R.drawable.w7));
        productsList.add(new Products(19, "Browser Application", "$ 17.00", R.drawable.browser));
        productsList.add(new Products(20, "Puzzle Application", "$ 25.00", R.drawable.puzzle));


        setProdItemRecycler1(productsList);

        return view;
    }
    private void setProdItemRecycler1(List<Products> productsList){

        prodItemRecycler1 = view.findViewById(R.id.product_recycler1);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        prodItemRecycler1.setLayoutManager(gridLayoutManager);
        productAdapter2 = new ProductAdapter2(getContext(), productsList);
        prodItemRecycler1.setAdapter(productAdapter2);

    }
}