package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductSubarrayTest {

    @Test
    public void test_maximum() throws Exception {
        int[] test = new int[5];
//        [2,-5,-2,-4,3]
        test[0] = 2;
        test[1] = -5;
        test[2] = -2;
        test[3] = -4;
        test[4] = 3;

        MaximumProductSubarray app = new MaximumProductSubarray();

        System.out.println(app.maxProduct(test));

    }
}