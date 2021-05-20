package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class SecondactivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME_EXTRA");

        TextView tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText("Hola " + name);

    }



}