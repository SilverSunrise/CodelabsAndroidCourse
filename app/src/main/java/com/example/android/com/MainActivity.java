package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button cShowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        cShowBtn = findViewById(R.id.button_zero);
    }

    public void ShowToast(View view) {
        Toast toast = Toast.makeText(this,"Hello Toast", Toast.LENGTH_SHORT);
        toast.show();
    }


    @SuppressLint("SetTextI18n")
    public void countUp(View view) {

        mCount++;
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0) {
            cShowBtn.setBackgroundColor(Color.rgb(231, 84, 128));
        } else {
            cShowBtn.setBackgroundColor(Color.rgb(151, 84, 188));
        }
    }

    public void ShowZero(View view) {
        mShowCount.setText("0");
        mCount = 0;
        cShowBtn.setBackgroundColor(Color.rgb(133, 133, 133));
    }
}

