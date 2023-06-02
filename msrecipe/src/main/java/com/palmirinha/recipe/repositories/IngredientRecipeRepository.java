package com.palmirinha.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palmirinha.recipe.models.IngredientRecipe;

public interface IngredientRecipeRepository extends JpaRepository<IngredientRecipe, Long> {

}
