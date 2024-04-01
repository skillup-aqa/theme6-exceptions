package ua.skillup.theme3.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LeapYearCheckerTest {

    @DataProvider(name = "years")
    public Object[][] years() {
        return new Object[][]{
                {2000, true},
                {2001, false},
                {2004, true},
                {1900, false}
        };
    }
    @Test(dataProvider = "years")
    public void testLeapYearChecker(int year, boolean expected) {
        assertEquals(LeapYearChecker.isLeapYear(year), expected);
    }
}
