package com.technocrats.tssofficial.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;
import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.activity.PostRev;
import com.technocrats.tssofficial.adapters.myadapter;
import com.technocrats.tssofficial.model.model;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ReviewFragment extends Fragment {
    RecyclerView recview;
    myadapter adapter;
    FloatingActionButton addRv;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        recview = view.findViewById(R.id.recview1);
        addRv = view.findViewById(R.id.addRev);


        addRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PostRev.class);
                startActivity(intent);

            }
        });
        recview.setLayoutManager(new LinearLayoutManager(getContext()));

        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Review"), model.class)
                        .build();

        adapter = new myadapter(options, this);
        recview.setAdapter(adapter);




        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}