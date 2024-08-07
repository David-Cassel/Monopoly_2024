
package com.monopoly.david;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends JpaRepository<SubtractionResult, Long> {
}