package com.palmirinha.recipe.models.mappers;

import java.time.Duration;

import com.palmirinha.recipe.models.Recipe;
import com.palmirinha.recipe.models.dto.RecipeDTO;

public  class RecipeMapper {
    public static Recipe fromDTO(RecipeDTO recipeDTO){
        return new Recipe(recipeDTO.name,
         Duration.ofMinutes(recipeDTO.timeToPrepare),
          recipeDTO.prepareMode);
    }
}
