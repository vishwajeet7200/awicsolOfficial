package com.technocrats.tssofficial.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.technocrats.tssofficial.R;


public class login extends Fragment {

    EditText editText1,editText2;
    FloatingActionButton floatingActionButton;
    FirebaseAuth auth;
    public View view;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_login, container, false);

        editText1 = view.findViewById(R.id.username);
        editText2 = view.findViewById(R.id.password);
        floatingActionButton=view.findViewById(R.id.signin);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=editText1.getText().toString().trim();
                String password = editText2.getText().toString().trim();

                if(TextUtils.isEmpty((email))){
                    editText1.setError("Email is required");
                }
                if (TextUtils.isEmpty(password)){
                    editText2.setError("Password is required");
                }

                auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            startActivity(new Intent(getActivity(),MainActivity.class));
                        }

                    }
                });

            }


        });


       return view;
    }
}