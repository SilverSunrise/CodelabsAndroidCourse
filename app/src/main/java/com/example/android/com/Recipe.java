package com.example.android.com;

class Recipe {
    private String titles;
    private String description;

    Recipe(String Title, String description) {
        this.titles = Title;
        this.description = description;
    }


    String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;

    }

    String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        this.description = description;

    }
}

