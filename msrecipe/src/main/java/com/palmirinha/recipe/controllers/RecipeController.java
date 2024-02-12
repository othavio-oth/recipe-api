package com.palmirinha.recipe.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palmirinha.recipe.models.Recipe;
import com.palmirinha.recipe.models.dto.IngredientRecipeDTO;
import com.palmirinha.recipe.models.dto.RecipeDTO;
import com.palmirinha.recipe.models.mappers.RecipeMapper;
import com.palmirinha.recipe.services.IngredientRecipeService;
import com.palmirinha.recipe.services.RecipeService;

@RestController
@RequestMapping("v1/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private IngredientRecipeService ingredientRecipeService;

    @GetMapping
    public ResponseEntity<List<Recipe>> getAllrecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        return ResponseEntity.ok(recipes);
    }

    @PostMapping
    public ResponseEntity<Recipe> saveRecipe(@RequestBody RecipeDTO RecipeDTO) {

        Recipe recipe = RecipeMapper.fromDTO(RecipeDTO);
        recipeService.saveRecipe(recipe);
        return ResponseEntity.ok(recipe);
    }


    @PostMapping("/add-ingredient")
    public ResponseEntity<Void> addIngredient(@RequestBody IngredientRecipeDTO ingredientRecipe) {
        ingredientRecipeService.saveIngredientRecipe(ingredientRecipe);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getRecipeById(@PathVariable Long id) {
        Recipe recipe = recipeService.getRecipeById(id);
        return ResponseEntity.ok(recipe);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
        return ResponseEntity.ok().build();
    }
}
