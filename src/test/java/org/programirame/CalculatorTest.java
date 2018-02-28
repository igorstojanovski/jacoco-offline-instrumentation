package org.programirame;

import org.igorski.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnCorrectMultiplication() {
        assertEquals(calculator.multiply(2,3), 6);
    }

}
