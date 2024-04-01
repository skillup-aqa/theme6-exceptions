package ua.skillup.theme3.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DartsGameTest {

    @DataProvider(name = "scores")
    public Object[][] scores() {
        return new Object[][]{
                {0, 11, 0},
                {0, 8, 1},
                {0, 4, 5},
                {0, 0, 10}
        };
    }
    @Test(dataProvider = "scores")
    public void testCalculateScore(double x, double y, int expected) {
        int result = DartsGame.getScore(x, y);
        assertEquals(result, expected);
    }
}
