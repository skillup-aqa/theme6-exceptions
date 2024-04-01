package ua.skillup.theme3.part3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testSumNumbersToN() {
        int n = 5;
        int expected = 15;
        assertEquals(MathCalculator.sumPositiveNumbersToN(n), expected);
    }

    @Test
    public void testSumNumbersTo0() {
        int n = 0;
        int expected = 0;
        assertEquals(MathCalculator.sumPositiveNumbersToN(n), expected);
    }

    @Test
    public void testCalculateFactorial() {
        int n = 5;
        int expected = 120;
        assertEquals(MathCalculator.factorial(n), expected);
    }

    @Test
    public void testCalculateFactorialZero() {
        int n = 0;
        int expected = 1;
        assertEquals(MathCalculator.factorial(n), expected);
    }

    @Test
    public void testIsPrime() {
        int n = 7;
        boolean expected = true;
        assertEquals(MathCalculator.isPrime(n), expected);
    }

    @Test
    public void testIsPrimeNegative() {
        int n = 8;
        boolean expected = false;
        assertEquals(MathCalculator.isPrime(n), expected);
    }

    @Test
    public void testIsPrimeOne() {
        int n = 1;
        boolean expected = false;
        assertEquals(MathCalculator.isPrime(n), expected);
    }

    @Test
    public void testIsArmstrongNumber() {
        int n = 153;
        boolean expected = true;
        assertEquals(MathCalculator.isArmstrongNumber(n), expected);
    }

    @Test
    public void testIsArmstrongNumberNegative() {
        int n = 154;
        boolean expected = false;
        assertEquals(MathCalculator.isArmstrongNumber(n), expected);
    }
}
