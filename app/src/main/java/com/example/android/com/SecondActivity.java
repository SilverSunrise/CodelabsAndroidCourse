package com.example.android.com;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String count = getIntent().getStringExtra(MainActivity.COUNT);
        TextView textViewCount = findViewById(R.id.show_count_secondActivity);
        textViewCount.setText(count);
    }
}
