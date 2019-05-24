package com.recipe.recipeService.controller;

import com.recipe.recipeService.entity.Recipe;
import com.recipe.recipeService.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping(path = "/")
    public List<Recipe> getAllRecipes(){
        return recipeRepository.getAllRecipes();
    }


}
