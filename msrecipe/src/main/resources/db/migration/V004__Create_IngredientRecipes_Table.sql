CREATE TABLE IngredientRecipes(
    id BIGINT NOT NULL AUTO_INCREMENT,
    amount DECIMAL(5,3),
    ingredient_id BIGINT NOT NULL,
    recipe_id BIGINT NOT NULL,
    unit_id BIGINT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;