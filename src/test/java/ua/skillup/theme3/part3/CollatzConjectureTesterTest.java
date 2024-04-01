package ua.skillup.theme3.part3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CollatzConjectureTesterTest {
    @Test
    public void testCollatzConjecture() {
        int number = 6;
        int expectedSteps = 8;
        int actualSteps = CollatzConjectureTester.collatzConjecture(number);
        assertEquals(actualSteps, expectedSteps);
    }

    @Test
    public void testCollatzConjectureZero() {
        assertThrows(IllegalArgumentException.class, () -> CollatzConjectureTester.collatzConjecture(0));
    }
}
