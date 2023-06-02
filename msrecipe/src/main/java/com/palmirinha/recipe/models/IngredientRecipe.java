package com.palmirinha.recipe.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "IngredientRecipes")
public class IngredientRecipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ingredient_id")
	private Ingredient ingredient;

	@ManyToOne
	@JoinColumn(name = "unit_id")
	private UnitOfMeasurement unitOfMeasurement;

	@ManyToOne
	@JoinColumn(name = "recipe_id")
	private Recipe recipe;

	private BigDecimal amount;

}
