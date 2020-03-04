package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        ThreeSum a = new ThreeSum();
        int[] num = {-1,0,1,2,-1,-4};
        a.threeSum(num);
    }
}