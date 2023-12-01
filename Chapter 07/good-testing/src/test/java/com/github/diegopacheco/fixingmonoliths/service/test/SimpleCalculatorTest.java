package com.github.diegopacheco.fixingmonoliths.service.test;

import com.github.diegopacheco.fixingmonoliths.service.SimpleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void testSimpleSum(){
        int inputA = 10;
        int inputB = 20;
        int result = new SimpleCalculator().sum(inputA,inputB);
        assertEquals(30,result);
    }

    @Test
    public void testSimpleSumArray(){
        int inputA[] = new int[]{1,2,3,4,5,6,7};
        int result = new SimpleCalculator().sum(inputA);
        assertEquals(28,result);
    }

    @Test
    public void testSimpleDivOk(){
        int inputA = 30;
        int inputB = 3;
        int result = new SimpleCalculator().div(inputA,inputB);
        assertEquals(10,result);
    }

    @Test
    public void testSimpleDivByZero(){
        int inputA = 30;
        int inputB = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new SimpleCalculator().div(inputA,inputB);
        });
    }

}
