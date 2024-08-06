package com.monopoly.david.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monopoly.david.model.SubtractionResult;
import com.monopoly.david.repository.CalculatorRepository;

import jakarta.validation.constraints.NotNull;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorRepository repository;

    @GetMapping("/subtract")
    public String subtract(@RequestParam @NotNull int a, @RequestParam @NotNull int b) {
        int result =  a - b;

        SubtractionResult subtractionResult = new SubtractionResult();
        subtractionResult.setA(a);
        subtractionResult.setB(b);
        subtractionResult.setResult(result);

        repository.save(subtractionResult);

        return String.valueOf(result);
    }

    
}