package com.example.android.com;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private static List<Recipe> recipeList = new ArrayList<>();
    private onRecipeClickListener onRecipeClickListener;

    RecipeAdapter(onRecipeClickListener onClickListener) {
        this.onRecipeClickListener = onClickListener;
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder {

        private TextView titleRecipeView;
        private TextView descriptionRecipeView;

        RecipeViewHolder(View itemView) {
            super(itemView);
            titleRecipeView = itemView.findViewById(R.id.tv_recipeTitle);
            descriptionRecipeView = itemView.findViewById(R.id.tv_recipeDescription);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Recipe recipe = recipeList.get(getLayoutPosition());
                    onRecipeClickListener.onRecipeClick(recipe);
                }
            });
        }

        void bind(Recipe item) {
            titleRecipeView.setText(item.getTitles());
            descriptionRecipeView.setText(item.getDescription());
        }
    }

    public interface onRecipeClickListener {
        void onRecipeClick(Recipe recipe);
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
