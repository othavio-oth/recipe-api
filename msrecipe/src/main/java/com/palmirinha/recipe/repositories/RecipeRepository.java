package com.palmirinha.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palmirinha.recipe.models.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
