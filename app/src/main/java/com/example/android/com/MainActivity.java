package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
    }

    private void showToast() {
        checkBox1 = findViewById(R.id.cb_chocolate);
        checkBox2 = findViewById(R.id.cb_sprinkles);
        checkBox3 = findViewById(R.id.cb_crushed_nuts);
        checkBox4 = findViewById(R.id.cb_cherries);
        checkBox5 = findViewById(R.id.cb_oreo_cookie);
        Button button = findViewById(R.id.show);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        StringBuilder result = new StringBuilder();
                        result.append(getString(R.string.appendName_mainActivity_toppings));
                        if (checkBox1.isChecked()) {
                            result.append(getString(R.string.appendName_mainActivity_chocolate));
                        }
                        if (checkBox2.isChecked()) {
                            result.append(getString(R.string.appendName_mainActivity_sprinkles));
                        }
                        if (checkBox3.isChecked()) {
                            result.append(getString(R.string.appendName_mainActivity_nuts));
                        }
                        if (checkBox4.isChecked()) {
                            result.append(getString(R.string.appendName_mainActivity_cherries));
                        }
                        if (checkBox5.isChecked()) {
                            result.append(getString(R.string.appendName_mainActivity_oreo));
                        }
                        Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
