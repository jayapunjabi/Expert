package com.example.expert.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.expert.R;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageView answered = findViewById(R.id.answered);
        ImageView status =  findViewById(R.id.status);
        ImageView feedback =  findViewById(R.id.feedback);

        answered.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Dashboard.this , QueryAnswered.class);
                startActivity(intent);
            }
        });

        feedback.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Dashboard.this , Feedback.class);
                startActivity(intent);
            }
        });

        status.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Dashboard.this , QueryStatus.class);
                startActivity(intent);
            }
        });


    }
}
