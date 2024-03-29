package com.palmirinha.recipe.models;

import java.time.Duration;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Recipes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(name = "time_to_prepare")
	@Type(type = "java.time.Duration")
	private Duration timeToPrepare;

	private String prepareMode;

	@OneToMany(mappedBy = "recipe")
	private List<IngredientRecipe> ingredientsRecipes;

	public Recipe(String name, Duration timeToPrepare, String prepareMode) {
		this.name = name;
		this.timeToPrepare = timeToPrepare;
		this.prepareMode = prepareMode;
	}

	

}
