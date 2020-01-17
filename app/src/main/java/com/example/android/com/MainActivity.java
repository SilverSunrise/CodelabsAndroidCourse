package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    public static final String ARTICLE =
            "com.example.android.com.EXTRA_ARTICLE";

    public static final String ARTICLE_HEADING =
            "com.example.android.com.EXTRA_ARTICLE_HEADING";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity_TextOne(View view) {
        Log.d(LOG_TAG, getString(R.string.logD_mainActivity_ButtonOneClicked));
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(ARTICLE, getString(R.string.textOne_mainActivity_article));
        intent.putExtra(ARTICLE_HEADING, getString(R.string.textOneHeading_mainActivity_HeadingArticle));
        startActivity(intent);
    }

    public void launchSecondActivity_TextTwo(View view) {
        Log.d(LOG_TAG, getString(R.string.logD_mainActivity_ButtonTwoClicked));
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(ARTICLE, getString(R.string.textTwo_mainActivity_article));
        intent.putExtra(ARTICLE_HEADING, getString(R.string.textTwoHeading_mainActivity_HeadingArticle));
        startActivity(intent);
    }

    public void launchSecondActivity_TextThree(View view) {
        Log.d(LOG_TAG, getString(R.string.logD_mainActivity_ButtonThreeClicked));
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(ARTICLE, getString(R.string.textThree_mainActivity_article));
        intent.putExtra(ARTICLE_HEADING, getString(R.string.textThreeHeading_mainActivity_HeadingArticle));
        startActivity(intent);
    }
}
