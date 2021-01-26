package com.technocrats.tssofficial.adapters;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.activity.AndroProdDesc1;
import com.technocrats.tssofficial.activity.AndroProdDesc10;
import com.technocrats.tssofficial.activity.AndroProdDesc11;
import com.technocrats.tssofficial.activity.AndroProdDesc12;
import com.technocrats.tssofficial.activity.AndroProdDesc13;
import com.technocrats.tssofficial.activity.AndroProdDesc14;
import com.technocrats.tssofficial.activity.AndroProdDesc15;
import com.technocrats.tssofficial.activity.AndroProdDesc16;
import com.technocrats.tssofficial.activity.AndroProdDesc17;
import com.technocrats.tssofficial.activity.AndroProdDesc18;
import com.technocrats.tssofficial.activity.AndroProdDesc19;
import com.technocrats.tssofficial.activity.AndroProdDesc2;
import com.technocrats.tssofficial.activity.AndroProdDesc20;
import com.technocrats.tssofficial.activity.AndroProdDesc3;
import com.technocrats.tssofficial.activity.AndroProdDesc4;
import com.technocrats.tssofficial.activity.AndroProdDesc5;
import com.technocrats.tssofficial.activity.AndroProdDesc6;
import com.technocrats.tssofficial.activity.AndroProdDesc7;
import com.technocrats.tssofficial.activity.AndroProdDesc8;
import com.technocrats.tssofficial.activity.AndroProdDesc9;
import com.technocrats.tssofficial.model.Products;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter6 extends RecyclerView.Adapter<ProductAdapter6.ProductViewHolder> {

    Context context;
    List<Products> productsList;

    public ProductAdapter6(Context context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductAdapter6.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.products_row_item, parent, false);
        return new ProductAdapter6.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductAdapter6.ProductViewHolder holder, final int position) {

        holder.prodImage.setImageResource(productsList.get(position).getImageUrl());
        holder.prodName.setText(productsList.get(position).getProductName());
        holder.prodPrice.setText(productsList.get(position).getProductPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, AndroProdDesc1.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 1) {
                    Intent i = new Intent(context, AndroProdDesc2.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 2) {
                    Intent i = new Intent(context, AndroProdDesc19.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 3) {
                    Intent i = new Intent(context, AndroProdDesc20.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }


                if (position == 4) {
                    Intent i = new Intent(context, AndroProdDesc3.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 5) {
                    Intent i = new Intent(context, AndroProdDesc4.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 6) {
                    Intent i = new Intent(context, AndroProdDesc5.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 7) {
                    Intent i = new Intent(context, AndroProdDesc6.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 8) {
                    Intent i = new Intent(context, AndroProdDesc7.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 9) {
                    Intent i = new Intent(context, AndroProdDesc8.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 10) {
                    Intent i = new Intent(context, AndroProdDesc9.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 11) {
                    Intent i = new Intent(context, AndroProdDesc10.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 12) {
                    Intent i = new Intent(context, AndroProdDesc11.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 13) {
                    Intent i = new Intent(context, AndroProdDesc12.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 14) {
                    Intent i = new Intent(context, AndroProdDesc13.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());

                }

                if (position == 15) {
                    Intent i = new Intent(context, AndroProdDesc14.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 16) {
                    Intent i = new Intent(context, AndroProdDesc15.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 17) {
                    Intent i = new Intent(context, AndroProdDesc16.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 18) {
                    Intent i = new Intent(context, AndroProdDesc17.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }

                if (position == 19) {
                    Intent i = new Intent(context, AndroProdDesc18.class);

                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                    context.startActivity(i, activityOptions.toBundle());
                }


            }
        });


    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }


    public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView prodImage;
        TextView prodName, prodPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            prodImage = itemView.findViewById(R.id.prod_image);
            prodName = itemView.findViewById(R.id.prod_name);
            prodPrice = itemView.findViewById(R.id.prod_price);



        }
    }
}
