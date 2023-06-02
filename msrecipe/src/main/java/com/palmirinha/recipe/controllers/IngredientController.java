package com.palmirinha.recipe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palmirinha.recipe.models.Ingredient;
import com.palmirinha.recipe.services.IngredientService;

@RestController
@RequestMapping("v1/ingredients")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping
    public ResponseEntity<List<Ingredient>> getAllIngredients() {
        List<Ingredient> ingredients = ingredientService.getAllIngredients();
        return ResponseEntity.ok(ingredients);
    }

    @PostMapping
    public ResponseEntity<Ingredient> saveIngredient(Ingredient ingredientDTO) {
        Ingredient ingredient = ingredientService.saveIngredient(ingredientDTO);
        return ResponseEntity.ok(ingredient);
    }
}
