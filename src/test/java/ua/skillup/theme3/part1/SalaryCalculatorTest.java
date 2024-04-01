package ua.skillup.theme3.part1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SalaryCalculatorTest {
    @Test
    public void testCalculateSalaryBeforeTaxes() {
        double hours = 40;
        double rate = 290.24;
        double expected = 11609.6;
        double result = SalaryCalculator.calculateSalaryBeforeTaxes(hours, rate);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculateSalaryAfterTaxes() {
        double hours = 40;
        double rate = 290.24;
        double expected = 9467.12;
        double result = SalaryCalculator.calculateSalaryAfterTaxes(hours, rate);

        System.out.println(result);
        System.out.println(expected);

        assertEquals(result, expected);
    }
}
