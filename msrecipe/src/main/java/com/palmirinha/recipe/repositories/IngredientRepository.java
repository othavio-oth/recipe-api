package com.palmirinha.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palmirinha.recipe.models.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
