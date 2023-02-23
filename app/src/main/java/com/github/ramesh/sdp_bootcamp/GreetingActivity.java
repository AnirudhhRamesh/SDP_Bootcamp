package com.github.ramesh.sdp_bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String value = intent.getStringExtra("username");

        TextView textView = (TextView) findViewById(R.id.greetTextView);
        textView.setText(String.format("Hello %s!", value));
    }
}