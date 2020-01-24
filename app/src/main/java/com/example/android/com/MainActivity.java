package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.Arrays;
import java.util.Collection;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recipeList;
    private RecipeAdapter recipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
        loadItem();
    }

    private void initRecyclerView() {
        recipeList = findViewById(R.id.rv_recipeList);
        recipeList.setLayoutManager(new LinearLayoutManager(this));
        recipeAdapter = new RecipeAdapter();
        recipeList.setAdapter(recipeAdapter);
    }

    private Collection<Recipe> getItem() {
        return Arrays.asList(
                new Recipe(getString(R.string.tv_mainActivity_firstRecipeTitle), getString(R.string.tv_mainActivity_firstRecipeDescription)),
                new Recipe(getString(R.string.tv_mainActivity_secondRecipeTitle), getString(R.string.tv_mainActivity_secondRecipeDescription)),
                new Recipe(getString(R.string.tv_mainActivity_thirdRecipeTitle), getString(R.string.tv_mainActivity_thirdRecipeDescription)),
                new Recipe(getString(R.string.tv_mainActivity_fourthRecipeTitle),getString(R.string.tv_mainActivity_fourthRecipeDescription)),
                new Recipe(getString(R.string.tv_mainActivity_fifthRecipeTitle),getString(R.string.tv_mainActivity_fifthRecipeDescription))
        );
    }

    private void loadItem() {
        Collection<Recipe> items = getItem();
        recipeAdapter.setItems(items);
    }

}
