package leet;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class RepeatedStringMatchTest {
    RepeatedStringMatch match ;
    String A, B;
    @Before
    public void setup() {
        match = new RepeatedStringMatch();
    }

    @Test
    public void test_example1() {
        A = "abcd"; // 4
        B = "cdabcdab"; // 8
        assertEquals(3, match.repeatedSTringMatch(A,B));
    }

    @Test
    public void test_double_A() {
        A = "a";
        B = "aa";
        assertEquals(2, match.repeatedSTringMatch(A,B));
    }

    @Test
    public void test_copied4() {
        A = "abc";
        B = "cabcabca";
        assertEquals(4, match.repeatedSTringMatch(A,B));
    }
}