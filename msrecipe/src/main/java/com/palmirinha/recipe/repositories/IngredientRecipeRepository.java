package com.palmirinha.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palmirinha.recipe.models.dto.IngredientRecipeDTO;

public interface IngredientRecipeRepository extends JpaRepository<IngredientRecipeDTO, Long> {

}
