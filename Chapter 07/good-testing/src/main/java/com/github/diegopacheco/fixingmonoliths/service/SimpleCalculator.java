package com.github.diegopacheco.fixingmonoliths.service;

import com.github.diegopacheco.fixingmonoliths.contract.v1.CalculatorV1;

import java.util.Arrays;

public class SimpleCalculator implements CalculatorV1 {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sum(int... a) {
        return Arrays.stream(a).reduce(0, Integer::sum);
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
