package com.palmirinha.recipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palmirinha.recipe.models.UnitOfMeasurement;

public interface UnitOfMeasurementRepository extends JpaRepository<UnitOfMeasurement, Long> {

}
