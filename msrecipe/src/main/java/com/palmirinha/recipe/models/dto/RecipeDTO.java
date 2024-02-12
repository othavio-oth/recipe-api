package com.palmirinha.recipe.models.dto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class RecipeDTO {

    public String name;
    public Long timeToPrepare;
    public String prepareMode;
    
}
