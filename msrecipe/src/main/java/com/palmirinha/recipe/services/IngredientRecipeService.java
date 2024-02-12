package com.palmirinha.recipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palmirinha.recipe.models.dto.IngredientRecipeDTO;
import com.palmirinha.recipe.repositories.IngredientRecipeRepository;

@Service
public class IngredientRecipeService {

    @Autowired
    private IngredientRecipeRepository ingredientRecipeRepository;


    public void saveIngredientRecipe(IngredientRecipeDTO ingredientRecipe) {
         ingredientRecipeRepository.save(ingredientRecipe);
    }


    // public void deleteIngredientRecipe(Long id) {
    //     IngredientRecipe ingredientRecipe = getIngredientRecipeById(id);
    //     ingredientRecipeRepository.delete(ingredientRecipe);
    // }

}
