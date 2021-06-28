package com.technocrats.tssofficial.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;
import com.technocrats.tssofficial.R;
import com.technocrats.tssofficial.model.UsersDatabase;

import androidx.appcompat.app.AppCompatActivity;

public class TvDetails extends AppCompatActivity {
    EditText nameInput, emailInput, phoneInput;
    ImageView tvImg;
    DatabaseReference reference;
    FirebaseDatabase rootNode;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_details);

        tvImg = findViewById(R.id.tvImg);
        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        phoneInput = findViewById(R.id.phoneInput);
        scrollView = findViewById(R.id.scrollView);

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/awicsol.appspot.com/o/tv.png?alt=media&token=9e98a899-d61b-4a69-99a8-103f61926e95").placeholder(R.drawable.androdef).into(tvImg);
    }

    private Boolean validateName() {
        String val = nameInput.getText().toString();

        if (val.isEmpty()) {
            nameInput.setError("Field cannot be empty");
            return false;
        }
        else {
            nameInput.setError(null);
            return true;
        }
    }

    private Boolean validateEmail() {
        String val = emailInput.getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (val.isEmpty()) {
            emailInput.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(emailPattern)) {
            emailInput.setError("Invalid email address");
            return false;
        } else {
            emailInput.setError(null);
            return true;
        }
    }

    private Boolean validatePhoneNo() {
        String val = phoneInput.getText().toString();

        if (val.isEmpty()) {
            phoneInput.setError("Field cannot be empty");
            return false;
        } else {
            phoneInput.setError(null);
            return true;
        }
    }

    public void submitBtn(View view) {
        if (!validateName() | !validateEmail() | !validatePhoneNo()) {
            return;
        }
        else {
            rootNode = FirebaseDatabase.getInstance();
            reference = rootNode.getReference("tv");
            String name = nameInput.getText().toString();
            String email = emailInput.getText().toString();
            String number = phoneInput.getText().toString();
            UsersDatabase usersDatabase = new UsersDatabase(name, email, number);
            reference.child(number).setValue(usersDatabase);
            nameInput.getText().clear();
            emailInput.getText().clear();
            phoneInput.getText().clear();
            Snackbar snackbar = Snackbar.make(scrollView, "Details submitted successfully", Snackbar.LENGTH_SHORT);
            snackbar.show();

        }
    }
}