package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    TwoSum ts;
    int[] arg1;
    int[] arg2;
    int target = 9;
    int target2 = 7;
    int[] expected1 = new int[2];
    int[] expected2 = new int[2];

    @Before
    public void setUp() throws Exception {
        ts = new TwoSum();
        arg1 = new int[4];
        arg1[0] = 2;
        arg1[1] = 7;
        arg1[2] = 10;
        arg1[3] = 11;

        expected1[0] = 0;
        expected1[1] = 1;

        arg2 = new int[4];
        arg2[0]= 2;
        arg2[1] = 2;
        arg2[2] = 3;
        arg2[3] = 4;
        expected2[0] = 2;
        expected2[1] = 3;

    }

    @Test
    public void twoSum1() throws Exception {
        int[] expected = new int[2];
        expected[0] = 0;
        expected[1] = 1;
        assertEquals(expected[0], ts.twoSum_original(arg1, target)[0]);
    }

    @Test
    public void twoSum2() throws Exception {

        int[] expected = new int[2];
        expected[0] = 2;
        expected[1] = 3;
        int[] result = ts.twoSum_original(arg2, target2);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);

    }

    @Test
    public void twoSum_upgrade1 () throws Exception {


        int[] result = ts.twoSum_upgraded(arg1, target);
        assertEquals(expected1[0], result[0]);
        assertEquals(expected1[1], result[1]);
    }

    @Test
    public void twoSum_upgrade2 () throws Exception {


        int[] result = ts.twoSum_upgraded(arg2, target2);
        assertEquals(expected2[0], result[0]);
        assertEquals(expected2[1], result[1]);
    }

    @Test
    public void twoSum3_1 () throws Exception {


        int[] result = ts.twoSum3(arg1, target);
        assertEquals(expected1[0], result[0]);
        assertEquals(expected1[1], result[1]);
    }

    @Test
    public void twoSum3_2 () throws Exception {


        int[] result = ts.twoSum3(arg2, target2);
        assertEquals(expected2[0], result[0]);
        assertEquals(expected2[1], result[1]);
    }
}