package com.example.android.com;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.textViewShowCount);

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(getString(R.string.mCountKey_mainActivity));
            mShowCount.setText(savedInstanceState.getString(getString(R.string.mShowCountKey_mainActivity)));
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mShowCount != null) {
            outState.putString(getString(R.string.mShowCountKey_mainActivity), mShowCount.getText().toString());
            outState.putInt(getString(R.string.mCountKey_mainActivity), mCount);
        }
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(String.valueOf(mCount));
        }
    }
}
