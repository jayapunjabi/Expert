package com.example.expert.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.expert.R;

public class SignUp extends AppCompatActivity {
    Button b;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        b = findViewById(R.id.btn_signup);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(SignUp.this, Login.class);
                startActivity(i);
            }
        });

    }
}
