package com.technocrats.tssofficial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technocrats.tssofficial.adapters.ProductAdapter1;
import com.technocrats.tssofficial.model.Products;
import com.technocrats.tssofficial.R;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LatestFragment extends Fragment {
    View view;
    RecyclerView prodItemRecycler1;
    ProductAdapter1 productAdapter1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_latest, container, false);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Tv Application", "$ 17.00", R.drawable.tvapp));
        productsList.add(new Products(2, "TikTok Application", "$ 25.00", R.drawable.tiktok));
        productsList.add(new Products(1, "Learning Application", "$ 17.00", R.drawable.w6));
        productsList.add(new Products(2, "Food Application", "$ 25.00", R.drawable.w3));
        productsList.add(new Products(1, "Medical Application", "$ 17.00", R.drawable.w2));
        productsList.add(new Products(2, "Weather Application", "$ 25.00", R.drawable.w7));
        productsList.add(new Products(1, "Shopping Application", "$ 17.00", R.drawable.shopping));
        productsList.add(new Products(2, "Beauty Application", "$ 25.00", R.drawable.beauty));

        setProdItemRecycler1(productsList);
        return view;
    }


    private void setProdItemRecycler1(List<Products> productsList){

        prodItemRecycler1 = view.findViewById(R.id.product_recycler1);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        prodItemRecycler1.setLayoutManager(gridLayoutManager);
        productAdapter1 = new ProductAdapter1(getContext(), productsList);
        prodItemRecycler1.setAdapter(productAdapter1);

    }
}