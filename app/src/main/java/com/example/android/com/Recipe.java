package com.example.android.com;

class Recipe {
    private String titles;
    private String description;
    private String ingredients;

    Recipe(String Title, String description, String ingredients) {
        this.titles = Title;
        this.description = description;
        this.ingredients = ingredients;
    }

    String getTitles() {
        return titles;
    }

    String getDescription() {
        return description;

    }

    String getIngredients() {
        return ingredients;
    }
}

