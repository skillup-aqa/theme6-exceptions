package ua.skillup.theme3.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class VowelCheckerTest {

    @DataProvider(name = "vowels")
    public Object[][] numbers() {
        return new Object[][]{
                {'a', true},
                {'e', true},
                {'i', true},
                {'o', true},
                {'u', true},
                {'b', false},
                {'c', false},
                {'d', false},
                {'f', false},
                {'g', false},
                {'h', false},
                {'j', false},
                {'k', false},
                {'l', false},
                {'m', false},
                {'n', false},
                {'p', false},
                {'q', false},
                {'r', false},
                {'s', false},
                {'t', false},
                {'v', false},
                {'w', false},
                {'x', false},
                {'y', false},
                {'z', false}
        };
    }

    @Test(dataProvider = "vowels")
    public void testVowel(char letter, boolean expected) {
        assertEquals(VowelChecker.isVowel(letter), expected);
    }
}
