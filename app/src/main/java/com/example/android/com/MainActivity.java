package com.example.android.com;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;


public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_IMAGE_CAPTURE = 1;
    private static final String TAG = "ImplicitIntent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebsite(View view) {
        EditText mWebsiteEditText = findViewById(R.id.website_editText);
        String url = mWebsiteEditText.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d(TAG, getString(R.string.logD_mainActivity_message));
        }
    }

    public void openLocation(View view) {
        EditText mLocationEditText = findViewById(R.id.location_editText);
        String loc = mLocationEditText.getText().toString();
        Uri adressUri = Uri.parse(getString(R.string.geoAdress_mainActvity_location) + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, adressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d(TAG, getString(R.string.logD_mainActivity_message));
        }
    }

    public void shareText(View view) {
        EditText mShareEditText = findViewById(R.id.share_editText);
        String txt = mShareEditText.getText().toString();
        String mimeType = getString(R.string.shareText_mainActvity_mimeType);
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(getString(R.string.shareText_mainActivity_ChooserTitle))
                .setText(txt)
                .startChooser();
    }

    public void openPhoto(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        } else {
            Log.d(TAG, getString(R.string.logD_mainActivity_message));
        }
    }
}
