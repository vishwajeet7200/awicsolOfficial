package com.technocrats.tssofficial.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
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
import com.google.firebase.auth.SignInMethodQueryResult;
import com.technocrats.tssofficial.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class login extends Fragment {

    private static final String TAG = "awicsol";
    EditText editText1,editText2;
    FloatingActionButton floatingActionButton;
    private FirebaseAuth mAuth ;
    FirebaseUser currentUser;
    public View view;
    ProgressDialog progressDialog;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_login, container, false);

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        editText1 = view.findViewById(R.id.username);
        editText2 = view.findViewById(R.id.password);
        floatingActionButton=view.findViewById(R.id.signin);
        progressDialog = new ProgressDialog(getContext());

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressDialog.setTitle("Logging in...");
                progressDialog.show();
                String email=editText1.getText().toString().trim();
                String password = editText2.getText().toString().trim();

                if (email.isEmpty()){
                    progressDialog.dismiss();
                    editText1.setError("Email is required");
                }

                if (password.isEmpty()){
                    progressDialog.dismiss();
                    editText2.setError("password is empty");
                }

                if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    editText1.setError("enter a valid email address");

                } else {
                    editText1.setError(null);
                }


                if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
                    editText2.setError("between 4 and 10 alphanumeric characters");

                } else {
                    editText2.setError(null);
                }

                mAuth.fetchSignInMethodsForEmail(editText1.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<SignInMethodQueryResult>() {
                            @Override
                            public void onComplete(@NonNull Task<SignInMethodQueryResult> task) {
                                boolean check = !task.getResult().getSignInMethods().isEmpty();
                                if (!check){
                                    progressDialog.dismiss();
                                    Toast.makeText(getContext(), "email not found", Toast.LENGTH_SHORT).show();
                                }


                            }
                        });



                if (email.isEmpty() && password.isEmpty()){
                    progressDialog.dismiss();
                    editText1.setError("Email is required");
                    editText2.setError("password is required");

                }
                else if (email.isEmpty() || password.isEmpty()){
                    progressDialog.dismiss();
                    Toast.makeText(getContext(), "enter the valid details", Toast.LENGTH_SHORT).show();

                }
                else {

                    mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){

                                startActivity(new Intent(getActivity(),MainActivity.class));
                                progressDialog.dismiss();
                            }

                        }
                    });

                }


            }


        });


       return view;
    }
}