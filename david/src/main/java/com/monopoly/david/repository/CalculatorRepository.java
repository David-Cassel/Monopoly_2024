
package com.monopoly.david.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monopoly.david.model.SubtractionResult;

public interface CalculatorRepository extends JpaRepository<SubtractionResult, Long> {
}