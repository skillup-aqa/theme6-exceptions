package ua.skillup.theme51.shapes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class ShapesTest {
    @DataProvider(name = "perimeterTests")
    public Object[][] perimeterTests() {
        return new Object[][]{
                {new Rectangle(1, 2), 6},
                {new Square(1), 4},
                {new Circle(1), Math.PI * 2},
                {new Triangle(1, 2, 3), 6}
        };
    }

    @Test(dataProvider = "perimeterTests")
    public void testPerimeter(Shape shape, double expectedPerimeter) {
        assertEquals(shape.perimeter(), expectedPerimeter);
    }

    @DataProvider(name = "areaTests")
    public Object[][] areaTests() {
        return new Object[][]{
                {new Rectangle(1, 2), 2},
                {new Square(1), 1},
                {new Circle(1), Math.PI },
                {new Triangle(3, 4, 5), 6}
        };
    }

    @Test(dataProvider = "areaTests")
    public void testArea(Shape shape, double expectedArea) {
        assertEquals(shape.area(), expectedArea);
    }

    @DataProvider(name = "equalsTests")
    public Object[][] equalsTests() {
        return new Object[][]{
                {new Rectangle(1, 2), new Rectangle(1, 2)},
                {new Rectangle(1, 2), new Rectangle(2, 1)},
                {new Square(1), new Square(1)},
                {new Circle(1), new Circle(1)},
                {new Triangle(3, 4, 5), new Triangle(3, 4, 5)},
                {new Triangle(3, 4, 5), new Triangle(3, 5, 4)},
                {new Triangle(3, 4, 5), new Triangle(4, 5, 3)},
                {new Triangle(3, 4, 5), new Triangle(4, 3, 5)},
                {new Triangle(3, 4, 5), new Triangle(5, 3, 4)},
                {new Triangle(3, 4, 5), new Triangle(5, 4, 3)}
        };
    }

    @Test(dataProvider = "equalsTests")
    public void testEquals(Shape shape1, Shape shape2) {
        assertEquals(shape1, shape2);
    }

    @Test(dataProvider = "equalsTests")
    public void testEqualHashCodes(Shape shape1, Shape shape2) {
        assertEquals(shape1.hashCode(), shape2.hashCode());
    }

    @DataProvider(name = "notEqualsTests")
    public Object[][] notEqualsTests() {
        return new Object[][]{
                {new Rectangle(1, 2), new Rectangle(2, 4)},
                {new Square(1), new Square(0)},
                {new Circle(1), new Circle(0)},
                {new Triangle(3, 4, 5), new Triangle(1, 1, 1)},
        };
    }

    @Test(dataProvider = "notEqualsTests")
    public void testNotEquals(Shape shape1, Shape shape2) {
        assertNotEquals(shape1, shape2);
    }

    @Test(dataProvider = "notEqualsTests")
    public void testNotEqualHashCodes(Shape shape1, Shape shape2) {
        assertNotEquals(shape1.hashCode(), shape2.hashCode());
    }
}
