package ua.skillup.theme3.part4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayOperationsTest {
    @Test
    public void testFillWithNumbers() {
        int[] array1 = IntArrayOperations.fillWithNumbers(new int[100]);
        int[] array2 = IntArrayOperations.fillWithNumbers(new int[100]);
        assertNotEquals(array1, array2);
    }

    @Test
    public void testMax() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.max(array1), 5);
    }

    @Test
    public void testMaxForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.max(array1), 0);
    }

    @Test
    public void testMin() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.min(array1), 1);
    }

    @Test
    public void testMinForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.min(array1), 0);
    }

    @Test
    public void testSum() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.sum(array1), 15);
    }

    @Test
    public void testSumForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.sum(array1), 0);
    }

    @Test
    public void testAverage() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.avg(array1), 3);
    }

    @Test
    public void testAverageForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.avg(array1), 0);
    }

    @Test
    public void testReverse() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] reversed = IntArrayOperations.reverse(array1);
        assertEquals(reversed, new int[]{5, 4, 3, 2, 1});
    }

    @Test
    public void testCopy() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] copied = IntArrayOperations.copy(array1);
        assertEquals(copied, array1);
    }

    @Test
    public void testIndexOf() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.indexOf(array1, 3), 2);
    }

    @Test
    public void testIndexOfNotFound() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.indexOf(array1, 6), -1);
    }

    @Test
    public void testRemoveDuplicates() {
        int[] array1 = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = IntArrayOperations.removeDuplicates(array1);
        assertEquals(result, expected);
    }

    @Test
    public void testRemoveDuplicatesForEmptyArray() {
        int[] array1 = {};
        int[] expected = {};
        int[] result = IntArrayOperations.removeDuplicates(array1);
        assertEquals(result, expected);
    }

    @Test
    public void testSort() {
        int[] array1 = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = IntArrayOperations.sort(array1);
        assertEquals(result, expected);
    }

    @Test
    public void testSortForEmptyArray() {
        int[] array1 = {};
        int[] expected = {};
        int[] result = IntArrayOperations.sort(array1);
        assertEquals(result, expected);
    }

    @Test
    public void testMerge() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, expected);
    }

    @Test
    public void testMergeForEmptyArray() {
        int[] array1 = {};
        int[] array2 = {};
        int[] expected = {};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, expected);
    }

    @Test
    public void testBinarySearch() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 3), 2);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 6), -1);
    }

    @Test
    public void testBinarySearchForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.binarySearch(array1, 6), -1);
    }

    @Test
    public void testBinarySearchForNotSortedElement() {
        int[] array1 = {3, 2, 1};
        assertThrows(IllegalArgumentException.class, () -> IntArrayOperations.binarySearch(array1, 1));
    }
}
