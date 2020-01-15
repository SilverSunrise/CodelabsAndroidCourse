package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
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
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(getString(R.string.extraCount_showToastMainActivity_putCount), mShowCount.getText().toString());
        startActivity(intent);
    }


    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText((String.valueOf(mCount)));
        }
    }

}
