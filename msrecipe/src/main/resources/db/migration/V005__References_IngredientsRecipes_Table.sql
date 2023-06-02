ALTER TABLE IngredientRecipes 
ADD CONSTRAINT FK_ingredient_recipes_ingredient_id FOREIGN KEY (ingredient_id) REFERENCES Ingredients(id),
ADD CONSTRAINT FK_ingredient_recipes_recipe_id FOREIGN KEY (recipe_id) REFERENCES Recipes(id),
ADD CONSTRAINT FK_ingredient_recipes_unit_id FOREIGN KEY (unit_id) REFERENCES UnitsOfMeasurement(id);