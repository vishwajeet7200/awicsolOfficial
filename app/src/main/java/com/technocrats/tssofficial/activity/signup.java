package com.technocrats.tssofficial.activity;

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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.technocrats.tssofficial.R;


public class signup extends Fragment {

    EditText editText1,editText2,uname;
    FloatingActionButton floatingActionButton;
    FirebaseAuth auth;
    DatabaseReference user;
    public View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_signup, container, false);

        editText1=view.findViewById(R.id.username);
        editText2=view.findViewById(R.id.password);
        uname=view.findViewById(R.id.name);
        floatingActionButton=view.findViewById(R.id.register);
        auth = FirebaseAuth.getInstance();

        user = FirebaseDatabase.getInstance().getReference().child("name");

        if(auth.getCurrentUser() != null){
            startActivity(new Intent(getActivity(),MainActivity.class));

        }

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=editText1.getText().toString().trim();
                String password = editText2.getText().toString().trim();
                String name=uname.getText().toString();

                if(TextUtils.isEmpty((email))){
                    editText1.setError("Email is required");
                }
                if (TextUtils.isEmpty(password)){
                    editText2.setError("Passeord is required");
                }

                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                       if(task.isSuccessful()){
                           startActivity(new Intent(getActivity(),MainActivity.class));
                       }
                    }
                });

                user.push().setValue(name);

            }
        });

        return view;
    }
}