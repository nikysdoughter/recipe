package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.model.RecipeListItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecentRecyclerView = findViewById(R.id.RecipeList);

        ArrayList<RecipeListItem> recipes = RecipeListItem.createRecipeList(30);
        MainActivityAdapter adapter = new MainActivityAdapter(recipes);
        mRecentRecyclerView.setAdapter(adapter);
        mRecentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // comment
    }
}
