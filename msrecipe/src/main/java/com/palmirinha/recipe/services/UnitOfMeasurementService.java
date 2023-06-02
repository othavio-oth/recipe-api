package com.palmirinha.recipe.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palmirinha.recipe.models.UnitOfMeasurement;
import com.palmirinha.recipe.repositories.UnitOfMeasurementRepository;

@Service
public class UnitOfMeasurementService {

    @Autowired
    private UnitOfMeasurementRepository unitOfMeasurementRepository;

    public UnitOfMeasurement getUnitOfMeasurementById(Long id) {
        Optional<UnitOfMeasurement> unitOfMeasurement = unitOfMeasurementRepository.findById(id);
        return unitOfMeasurement.orElseThrow(() -> new EntityNotFoundException("Unidade de medida não encontrada"));
    }

    public UnitOfMeasurement saveUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
        return unitOfMeasurementRepository.save(unitOfMeasurement);
    }

    public List<UnitOfMeasurement> getAllUnitOfMeasurements() {
        return unitOfMeasurementRepository.findAll();
    }

    public void deleteUnitOfMeasurement(Long id) {
        UnitOfMeasurement unitOfMeasurement = getUnitOfMeasurementById(id);
        unitOfMeasurementRepository.delete(unitOfMeasurement);
    }

}
