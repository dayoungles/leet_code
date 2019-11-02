package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxIncreaseKeepingSkylineTest {
    MaxIncreaseKeepingSkyline sky = new MaxIncreaseKeepingSkyline();

    @Test
    public void testincrease() {
        int[][] sample = new int[4][4];
        int[] row0={3,0,8,4};
        int[] row1={2,4,5,7};
        int[] row2={9,2,6,3};
        int[] row3={0,3,1,0};

        sample[0] = row0;
        sample[1] = row1;
        sample[2] = row2;
        sample[3] = row3;
        MaxIncreaseKeepingSkyline sky = new MaxIncreaseKeepingSkyline();

        assertEquals(35, sky.maxIncreaseKeepingSkyline(sample));

    }

    @Test
    public void test_setBiggestNumIntoArray() {

    }
}