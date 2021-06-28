package com.technocrats.tssofficial.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.fragments.ReviewFragment;
import com.technocrats.tssofficial.model.model;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter<model, myadapter.myviewholder>
{

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     * @param reviewFragment
     */
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options, ReviewFragment reviewFragment) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull final model model)
    {
        holder.name.setText(model.getTitle());
        holder.desc.setText(model.getDescription());
        Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);


    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }


    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        TextView name,desc;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img = itemView.findViewById(R.id.img1);
            name = itemView.findViewById(R.id.nametext);
            desc = itemView.findViewById(R.id.desctext);
        }
    }
}
