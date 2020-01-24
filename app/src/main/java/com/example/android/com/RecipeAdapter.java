package com.example.android.com;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>{

    private static List<Recipe> recipeList = new ArrayList<>();


    class RecipeViewHolder extends RecyclerView.ViewHolder {

        private TextView titleRecipeView;
        private TextView descriptionRecipeView;

        RecipeViewHolder(View itemView) {
            super(itemView);
            titleRecipeView = itemView.findViewById(R.id.tv_recipeTitle);
            descriptionRecipeView = itemView.findViewById(R.id.tv_recipeDescription);
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    getAdapterPosition();
//                    Context context = MainActivity.this;
//                    Class showRecipe = TextRecipeActivity.class;
//                    Intent txtRecipeActivity = new Intent(context, showRecipe);
//                }
//            });
        }

        void bind(Recipe item) {
            titleRecipeView.setText(item.getTitles());
            descriptionRecipeView.setText(item.getDescription());
        }
    }

     void setItems(Collection<Recipe> items) {
        recipeList.clear();
        recipeList.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
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
