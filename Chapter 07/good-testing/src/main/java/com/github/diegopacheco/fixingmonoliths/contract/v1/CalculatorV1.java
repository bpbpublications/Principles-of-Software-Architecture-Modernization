package com.github.diegopacheco.fixingmonoliths.contract.v1;

public interface CalculatorV1 {
    int sum(int a, int b);
    int sum(int ...a);
    int div(int a, int b);
}
