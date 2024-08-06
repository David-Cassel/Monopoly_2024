package com.monopoly.david.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotNull;

@RestController
public class CalculatorController {
    @GetMapping("/subtract")
    public int subtract(@RequestParam @NotNull int a, @RequestParam @NotNull int b) {
        return a - b;
    }

    
}