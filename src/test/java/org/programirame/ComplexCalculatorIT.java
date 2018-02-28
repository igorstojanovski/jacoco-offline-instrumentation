package org.programirame;

import org.igorski.ComplexCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexCalculatorIT {

    private ComplexCalculator complexCalculator;

    @Before
    public void init() {
        complexCalculator = new ComplexCalculator();
    }

    @Test
    public void shouldReturnCorrectSum() {
        int sum = complexCalculator.sumAll(1,2,3);

        assertEquals(sum, 6);
    }

}
