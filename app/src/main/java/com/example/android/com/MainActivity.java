package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EditName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Happy birthday to Mari");
        Log.e("MainActivity", "Happy birthday to Mari");
        Log.i("MainActivity", "Happy birthday to Mari");
        Log.w("MainActivity", "Happy birthday to Mari");
        EditName = findViewById(R.id.edit_name);
    }


    @SuppressLint("SetTextI18n")
    public void show_congratulation(View view) {
        TextView show = findViewById(R.id.show_congratulation);
        String name = EditName.getText().toString();
        show.setText("Happy birthday to " + name);
    }
}
