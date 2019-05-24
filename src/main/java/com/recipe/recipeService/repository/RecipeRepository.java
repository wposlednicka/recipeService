package com.recipe.recipeService.repository;

import com.recipe.recipeService.entity.Ingredient;
import com.recipe.recipeService.entity.Recipe;
import com.recipe.recipeService.entity.Unit;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

    private static List<Recipe> recipes = new ArrayList<>();

    static {
        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(new Ingredient("mąka", "500", Unit.DAG));
        ingredientList.add(new Ingredient("woda", "200", Unit.ML));
        recipes.add(new Recipe("Spaghetti", "Dodaj sos", ingredientList));
    }

    public List<Recipe> getAllRecipes(){
        return recipes;
    }

    
}
