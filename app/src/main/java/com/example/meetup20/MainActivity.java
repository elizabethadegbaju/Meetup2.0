package com.example.meetup20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Click(View view) {
        Toast.makeText(this, "This is the day the Lord has made!", Toast.LENGTH_SHORT).show();
    }

    public void onButton2Click(View view) {
        Toast.makeText(this, "This is my second android app!", Toast.LENGTH_SHORT).show();
    }

    public void onButton3Click(View view) {
        EditText username = findViewById(R.id.usernameEditText);
        EditText password = findViewById(R.id.passwordEditText);
        String outputString = username.getText().toString().concat(" ".concat(password.getText().toString()));
        Toast.makeText(this, outputString, Toast.LENGTH_SHORT).show();
    }
}
