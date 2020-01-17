package com.example.android.com;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String article = intent.getStringExtra(MainActivity.ARTICLE);
        String article_heading = intent.getStringExtra(MainActivity.ARTICLE_HEADING);
        TextView textViewArticle = findViewById(R.id.article);
        TextView textViewArticleHeading = findViewById(R.id.article_heading);
        textViewArticle.setText(article);
        textViewArticleHeading.setText(article_heading);
    }
}
