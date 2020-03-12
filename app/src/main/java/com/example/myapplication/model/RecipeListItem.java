package com.example.myapplication.model;

import java.util.ArrayList;

public class RecipeListItem {
    private String mName;
    private boolean mOnline;

    public RecipeListItem(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    private static int lastRecipeId = 0;

    public static ArrayList<RecipeListItem> createRecipeList(int numContacts) {
        ArrayList<RecipeListItem> recipes = new ArrayList<RecipeListItem>();

        for (int i = 1; i <= numContacts; i++) {
            recipes.add(new RecipeListItem("Recipe " + ++lastRecipeId));
        }

        return recipes;
    }
}
