package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String count = getIntent().getStringExtra("count");
        TextView textView = findViewById(R.id.showCountSecond);
        textView.setText(count);


    }
}
