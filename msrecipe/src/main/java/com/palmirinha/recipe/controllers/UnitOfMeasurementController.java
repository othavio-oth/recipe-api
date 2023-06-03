package com.palmirinha.recipe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palmirinha.recipe.models.UnitOfMeasurement;
import com.palmirinha.recipe.services.UnitOfMeasurementService;

@RestController
@RequestMapping("v1/units-of-measurement")
public class UnitOfMeasurementController {

    @Autowired
    private UnitOfMeasurementService unitOfMeasurementService;

    @GetMapping
    public ResponseEntity<List<UnitOfMeasurement>> getAllUnitOfMeasurements() {
        List<UnitOfMeasurement> unitOfMeasurements = unitOfMeasurementService.getAllUnitOfMeasurements();
        return ResponseEntity.ok(unitOfMeasurements);
    }

    @PostMapping
    public ResponseEntity<UnitOfMeasurement> saveUnitOfMeasurement(
            @RequestBody UnitOfMeasurement UnitOfMeasurementDTO) {
        UnitOfMeasurement unitOfMeasurement = unitOfMeasurementService.saveUnitOfMeasurement(UnitOfMeasurementDTO);
        return ResponseEntity.ok(unitOfMeasurement);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getUnitOfMeasurementById(@PathVariable Long id) {
        UnitOfMeasurement unitOfMeasurement = unitOfMeasurementService.getUnitOfMeasurementById(id);
        return ResponseEntity.ok(unitOfMeasurement);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUnitOfMeasurement(@PathVariable Long id) {
        unitOfMeasurementService.deleteUnitOfMeasurement(id);
        return ResponseEntity.ok().build();
    }
}
