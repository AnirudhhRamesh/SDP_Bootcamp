package com.github.ramesh.sdp_bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String userName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.mainGoButton);
        button.setOnClickListener(v -> {
            EditText textView = (EditText) findViewById(R.id.mainName);
            userName = textView.getText().toString();

            Intent greetIntent = new Intent(MainActivity.this, GreetingActivity.class);
            greetIntent.putExtra("username", userName);
            MainActivity.this.startActivity(greetIntent);
        });

    }
}