package com.palmirinha.recipe.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palmirinha.recipe.models.IngredientRecipe;
import com.palmirinha.recipe.repositories.IngredientRecipeRepository;

@Service
public class IngredientRecipeService {

    @Autowired
    private IngredientRecipeRepository ingredientRecipeRepository;

    public IngredientRecipe getIngredientRecipeById(Long id) {
        Optional<IngredientRecipe> ingredientRecipe = ingredientRecipeRepository.findById(id);
        return ingredientRecipe.orElseThrow(() -> new EntityNotFoundException("IngredienteReceita não encontrado"));
    }

    public IngredientRecipe saveIngredientRecipe(IngredientRecipe ingredientRecipe) {
        return ingredientRecipeRepository.save(ingredientRecipe);
    }

    public List<IngredientRecipe> getAllIngredientRecipes() {
        return ingredientRecipeRepository.findAll();
    }

    public void deleteIngredientRecipe(Long id) {
        IngredientRecipe ingredientRecipe = getIngredientRecipeById(id);
        ingredientRecipeRepository.delete(ingredientRecipe);
    }

}
