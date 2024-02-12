package com.palmirinha.recipe.models.dto;
import java.math.BigDecimal;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientRecipeDTO {

	

	@ManyToOne
	@JoinColumn(name = "ingredient_id")
	private Long ingredient;

	@ManyToOne
	@JoinColumn(name = "unit_id")
	private Long unitOfMeasurement;

	@ManyToOne
	@JoinColumn(name = "recipe_id")
	private Long recipe;

	private BigDecimal amount;

}
