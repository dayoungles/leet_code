package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubArrayTest {

    @Test
    public void maxSubArray() {
        MaximumSubArray a = new MaximumSubArray();
        int [] n = {23171,21011,21123,21366,21013,21367};
        System.out.println(a.maxSubArray(n));
    }
}