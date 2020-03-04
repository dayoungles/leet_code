package leet.model;

import leet.CyclicRotation;
import org.junit.Test;

public class ReversedArrayTest {

    @Test
    public void test_reversed() {
        CyclicRotation array = new CyclicRotation();
        int [] a = {3,9,7,6,5};
        int k = 3;
        array.solution(a, k);
    }
}