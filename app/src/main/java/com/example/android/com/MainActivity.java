package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


import java.util.Arrays;
import java.util.Collection;


public class MainActivity extends AppCompatActivity {

    private RecipeAdapter recipeAdapter;

    public static final String RECIPE_TITLE =
            "com.example.android.com.EXTRA_RECIPE_TITLE";

    public static final String RECIPE_INGREDIENTS =
            "com.example.android.com.EXTRA_RECIPE_INGREDIENTS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
        loadItem();
    }

    private void initRecyclerView() {
        RecyclerView recipeList = findViewById(R.id.rv_recipeList);
        recipeList.setLayoutManager(new LinearLayoutManager(this));

        RecipeAdapter.onRecipeClickListener onRecipeClickListener = new RecipeAdapter.onRecipeClickListener() {
            @Override
            public void onRecipeClick(Recipe recipe) {
                Intent intent = new Intent(MainActivity.this, TextRecipeActivity.class);
                intent.putExtra(RECIPE_TITLE, recipe.getTitles());
                intent.putExtra(RECIPE_INGREDIENTS, recipe.getIngredients());
                startActivity(intent);
            }
        };

        recipeAdapter = new RecipeAdapter(onRecipeClickListener);

        recipeList.setAdapter(recipeAdapter);
    }

    private Collection<Recipe> getItem() {
        return Arrays.asList(
                new Recipe(getString(R.string.tv_mainActivity_firstRecipeTitle), getString(R.string.tv_mainActivity_firstRecipeDescription), getString(R.string.tv_mainActivity_firstRecipeIngredients)),
                new Recipe(getString(R.string.tv_mainActivity_secondRecipeTitle), getString(R.string.tv_mainActivity_secondRecipeDescription), getString(R.string.tv_mainActivity_secondRecipeIngredients)),
                new Recipe(getString(R.string.tv_mainActivity_thirdRecipeTitle), getString(R.string.tv_mainActivity_thirdRecipeDescription), getString(R.string.tv_mainActivity_thirdRecipeIngredients)),
                new Recipe(getString(R.string.tv_mainActivity_fourthRecipeTitle), getString(R.string.tv_mainActivity_fourthRecipeDescription), getString(R.string.tv_mainActivity_fourthRecipeIngredients)),
                new Recipe(getString(R.string.tv_mainActivity_fifthRecipeTitle), getString(R.string.tv_mainActivity_fifthRecipeDescription), getString(R.string.tv_mainActivity_fifthRecipeIngredients))
        );
    }

    private void loadItem() {
        Collection<Recipe> items = getItem();
        recipeAdapter.setItems(items);
    }

}
