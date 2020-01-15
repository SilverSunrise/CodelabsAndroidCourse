package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myLogs";

    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "найдём View-элемент");
        editTextName = findViewById(R.id.edit_name);

        Log.e(TAG, "Ooops here");
        Log.i(TAG, "Ooops here too");
        Log.w(TAG, "Nothing here");
    }


    public void showCongratulation(View view) {
        Log.d(TAG, "находим элемент по его ID");
        TextView showCongrats = findViewById(R.id.show_congratulation);
        String name = editTextName.getText().toString();
        Log.d(TAG, "меняем текст в TextView (show)");
        showCongrats.setText(String.format(getString(R.string.textCongrats_MainActivity), name));
    }
}
