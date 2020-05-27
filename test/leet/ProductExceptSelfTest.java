package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductExceptSelfTest {
    ProductExceptSelf p = new ProductExceptSelf();
    int[] input;
    @Test
    public void test_sample1() {
        input = new int[]{1, 2,3,4};

        int[] output = p.productExceptSelf(input);

        assertEquals(24, output[0]);
        assertEquals(12, output[1]);
        assertEquals(8, output[2]);
        assertEquals(6, output[3]);
    }

    @Test
    public void test_WrongAnswer() {
        input = new int[]{1,0};

        int[] output = p.productExceptSelf(input);

        assertEquals(0, output[0]);
        assertEquals(1, output[1]);
    }
}