package com.recipe.recipeService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Recipe {

    private String name;
    private String description;


    private List<Ingredient> ingredients;

}
