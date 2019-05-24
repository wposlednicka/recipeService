package com.recipe.recipeService.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor

public class Ingredient {


    private String name;
    private String amount;
    private Unit unit;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "recipe_id", nullable = false)
//    @JsonIgnore
//    private Recipe recipe;



}
