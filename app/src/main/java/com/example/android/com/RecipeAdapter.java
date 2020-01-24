package com.example.android.com;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>{

    private List<itemModel> recipeList = new ArrayList<>();

    class RecipeViewHolder extends RecyclerView.ViewHolder {

        private TextView titleRecipeView;
        private TextView descriptionRecipeView;

        public RecipeViewHolder(View itemView) {
            super(itemView);
            titleRecipeView = itemView.findViewById(R.id.tv_recipeTitle);
            descriptionRecipeView = itemView.findViewById(R.id.tv_recipeDescription);
        }

        public void bind(itemModel item) {
            titleRecipeView.setText(item.getTitles());
            descriptionRecipeView.setText(item.getDescription());
        }

    }

    @Override
    public RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_item, parent, false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int position) {
        holder.bind(recipeList.get(position));
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }
}
