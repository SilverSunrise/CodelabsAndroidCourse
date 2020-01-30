package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.tv_activityOrder_order);
        textView.setText(message);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.sameDay:
                if (checked) displayToast(getString(R.string.rb_activityOrder_textSameDay));
                break;
            case R.id.nextDay:
                if (checked) displayToast(getString(R.string.rb_activityOrder_textNextDay));
                break;
            case R.id.pickUp:
                if (checked) displayToast(getString(R.string.rb_activityOrder_textPickUp));
                break;
            default:
                break;
        }
    }

}
