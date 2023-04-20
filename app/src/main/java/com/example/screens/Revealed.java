package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Revealed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revealed);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView mainText = findViewById(R.id.mainText);
            String secretText = extras.getString("secretText");
            mainText.setText(secretText);
        }
    }
}