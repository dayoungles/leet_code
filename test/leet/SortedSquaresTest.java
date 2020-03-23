package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSquaresTest {
    SortedSquares s;
    int[] A = {-4, -1, 0, 3, 10};
    int[] expect = {0, 1, 9, 16, 100};

    @Before
    public void before () {
          s = new SortedSquares();
    }

    @Test
    public void sortedSquares() {
        int[] result = s.sortedSquares_easy(A);
        assertEquals(expect[0], result[0]);
        assertEquals(expect[1], result[1]);
        assertEquals(expect[2], result[2]);
        assertEquals(expect[3], result[3]);
        assertEquals(expect[4], result[4]);

    }
    @Test
    public void sortedSquares2() {
        int[] result = s.sortedSquares_linkedlist(A);
        assertEquals(expect[0], result[0]);
        assertEquals(expect[1], result[1]);
        assertEquals(expect[2], result[2]);
        assertEquals(expect[3], result[3]);
        assertEquals(expect[4], result[4]);
    }

    @Test
    public void test_sort() {
        int[] result = s.sortedSquares_solutionWithMergeSort(A);

        assertEquals(expect[0], result[0]);
        assertEquals(expect[1], result[1]);
        assertEquals(expect[2], result[2]);
        assertEquals(expect[3], result[3]);
        assertEquals(expect[4], result[4]);
    }
}