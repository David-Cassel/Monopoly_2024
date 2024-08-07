package com.monopoly.david;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int subtractTwoIntegers(int a, int b) {
        return a - b;
    }
}
