package com.technocrats.tssofficial.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.technocrats.tssofficial.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class signup extends Fragment {

    EditText editText1,editText2,uname;
    FloatingActionButton floatingActionButton;
    FirebaseAuth auth;
    DatabaseReference user;
    private FirebaseAuth mAuth ;
    FirebaseUser currentUser;
    public View view;
    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_signup, container, false);

        editText1=view.findViewById(R.id.username);
        editText2=view.findViewById(R.id.password);
        uname=view.findViewById(R.id.name);
        progressDialog = new ProgressDialog(getContext());
        floatingActionButton=view.findViewById(R.id.register);
        auth = FirebaseAuth.getInstance();

        user = FirebaseDatabase.getInstance().getReference().child("name");

        if(auth.getCurrentUser() != null){
            startActivity(new Intent(getActivity(),MainActivity.class));

        }

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.setTitle("Signing Up...");
                progressDialog.show();
                String email=editText1.getText().toString().trim();
                String password = editText2.getText().toString().trim();
                final String name=uname.getText().toString();

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

                           mAuth = FirebaseAuth.getInstance();
                           currentUser = mAuth.getCurrentUser();

                           UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                                   .setDisplayName(name).build();

                           startActivity(new Intent(getActivity(),MainActivity.class));
                           progressDialog.dismiss();
                           currentUser.updateProfile(profileUpdates).addOnCompleteListener(new OnCompleteListener<Void>() {
                               @Override
                               public void onComplete(@NonNull Task<Void> task) {
                                   if (task.isSuccessful()) {
                                       Toast.makeText(getContext(), "user profile updated", Toast.LENGTH_SHORT).show();
                                   }
                               }
                           });
                       }
                    }
                });

                user.push().setValue(name);

            }
        });

        return view;
    }
}