package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogTest {
    @Test
    public void test () {
        Frog a = new Frog();
        int[] tst = {1, 3, 7, 4, 2, 3, 5, 4};
        System.out.println(a.solution(5, tst));

    }


}