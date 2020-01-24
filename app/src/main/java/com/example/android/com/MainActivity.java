package com.example.android.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recipeList;
    private RecipeAdapter recipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeList = findViewById(R.id.rv_recipeList);
        recipeList.setLayoutManager(new LinearLayoutManager(this));


        itemModel[] itemModels = new itemModel[3];
        for (int i = 0; i < 3; i++) {
            itemModels[i] = new itemModel();

        }

        recipeAdapter = new RecipeAdapter();
        recipeList.setAdapter(recipeAdapter);

    }




}
