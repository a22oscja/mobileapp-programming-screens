package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.revealButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText secrets = findViewById(R.id.secrets);
                String secretText = String.valueOf(secrets.getText());
                Intent intent = new Intent(MainActivity.this, Revealed.class);
                intent.putExtra("secretText", secretText);
                startActivity(intent);
            }
        });
    }
}
