package org.programirame;

/**
 * Class with methods that perform complex arithmetic operations.
 *
 */
public class ComplexCalculator {

    /**
     * Summ all the given numbers.
     *
     * @param numbers array of numbers
     * @return sum of all the numbers.
     */
    public int sumAll(int... numbers) {
        int sum = 0;
        Calculator calculator = new Calculator();
        if(numbers.length >= 2) {
            for(int number:numbers) {
                sum = calculator.add(sum, number);
            }
        } else if(numbers.length == 1) {
            return numbers[0];
        } else {
            return 0;
        }

        return sum;
    }

}
