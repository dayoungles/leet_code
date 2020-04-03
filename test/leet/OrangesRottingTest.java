package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrangesRottingTest {
    OrangesRotting r;

    @Before
    public void setup() {
        r = new OrangesRotting();
    }

    @Test
    public void test_sample1() {
        int[] row1 = {2, 1, 1};
        int[] row2 = {1, 1, 0};
        int[] row3 = {0, 1, 1};

        int[][] input = {row1, row2, row3};
        int result = r.orangesRotting(input);
        assertEquals(4, result);

    }

    @Test
    public void test_impossible_case() {
        int[] row1 = {2, 1, 1};
        int[] row2 = {0, 1, 1};
        int[] row3 = {1, 0, 1};

        int[][] input = {row1, row2, row3};
        int result = r.orangesRotting(input);
        assertEquals(-1, result);
    }

    @Test
    public void test_() {
        int[] row1 = {0, 2};

        int[][] input = {row1};
        int result = r.orangesRotting(input);
        assertEquals(0, result);

    }

    @Test
    public void test_failed() {
        int[] row1={1,2};
        int[][] input = {row1};

        int result = r.orangesRotting(input);
        assertEquals(1, result);
    }


}