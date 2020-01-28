package com.example.android.com;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_info);
        TextView tv_recipeTitle = findViewById(R.id.tv_recipeActivity_title);
        TextView tv_recipeDescription = findViewById(R.id.tv_recipeActivity_ingredients);
        Intent intent = getIntent();
        String recipeTitle = intent.getStringExtra(MainActivity.RECIPE_TITLE);
        String recipeDescription = intent.getStringExtra(MainActivity.RECIPE_INGREDIENTS);
        tv_recipeTitle.setText(recipeTitle);
        tv_recipeDescription.setText(recipeDescription);
    }
}
