package com.technocrats.tssofficial.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.activity.Authentication;

import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    EditText name;
    DatabaseReference user;
    public View view;
    TextView textName, textEmail, textUID;
    private FirebaseAuth mAuth ;
    FirebaseUser currentUser;
    Button logoutbtn;
    ImageView dp;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        textName = view.findViewById(R.id.textViewName);
        textEmail = view.findViewById(R.id.textViewEmail);

        logoutbtn = view.findViewById(R.id.logOutBtn);
        dp = view.findViewById(R.id.displayImg);

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mAuth.signOut();
                startActivity(new Intent(getContext(), Authentication.class));
                getActivity().finish();
            }
        });



        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        textName.setText(currentUser.getDisplayName());
        textEmail.setText(currentUser.getEmail());


        return view;
    }

}