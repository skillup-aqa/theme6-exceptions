package ua.skillup.theme52;

import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.Assert.assertEquals;

public class AgeCalculatorTest {
    @Test
    public void testCalculateAgeLessThenYear() {
        LocalDate lessThenYear = LocalDate.now().minusDays(364);
        assertEquals(AgeCalculator.calculateAge(lessThenYear), 0);
    }

    @Test
    public void testCalculateAgeMoreThenYear() {
        LocalDate lessThenYear = LocalDate.now().minusDays(366);
        assertEquals(AgeCalculator.calculateAge(lessThenYear), 1);
    }
}
