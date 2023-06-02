CREATE TABLE Recipes(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    prepare_mode VARCHAR(255),
    time_to_prepare TIME,
    PRIMARY KEY (id)
) ENGINE=InnoDB;