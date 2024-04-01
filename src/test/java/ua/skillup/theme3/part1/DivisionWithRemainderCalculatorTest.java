package ua.skillup.theme3.part1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivisionWithRemainderCalculatorTest {
    @Test
    public void testCalculateRemainder() {
        int dividend = 10;
        int divisor = 3;
        int expected = 1;
        int result = DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculateRemainderNegative() {
        int dividend = -10;
        int divisor = 3;
        int expected = -1;
        int result = DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculateRemainderZero() {
        int dividend = 0;
        int divisor = 3;
        int expected = 0;
        int result = DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor);
        assertEquals(result, expected);
    }
}
