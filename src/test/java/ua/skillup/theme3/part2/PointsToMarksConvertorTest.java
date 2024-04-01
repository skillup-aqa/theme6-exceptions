package ua.skillup.theme3.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class PointsToMarksConvertorTest {

    @DataProvider(name = "pointsAndMarks")
    public Object[][] pointsAndMarks() {
        return new Object[][]{
                {50, 'F'},
                {60, 'D'},
                {75, 'C'},
                {85, 'B'},
                {90, 'A'},
                {100, 'A'}
        };
    }
    @Test(dataProvider = "pointsAndMarks")
    public void testMarksCalculator(int mark, char expected) {
        assertEquals(PointsToMarksConvertor.convertPointsToMarks(mark), expected);
    }

    @Test
    public void testInvalidPoints() {
        int points = -1;
        assertThrows(IllegalArgumentException.class, () -> PointsToMarksConvertor.convertPointsToMarks(points));
    }

    @Test
    public void testTooBigPoints() {
        int points = 101;
        assertThrows(IllegalArgumentException.class, () -> PointsToMarksConvertor.convertPointsToMarks(points));
    }
}
