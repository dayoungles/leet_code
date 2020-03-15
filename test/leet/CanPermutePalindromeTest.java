package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanPermutePalindromeTest {
    CanPermutePalindrome c = new CanPermutePalindrome();

    @Test
    public void canPermutePalindrome() {
        assertFalse(c.canPermutePalindrome("code"));
    }

    @Test
    public void test_aab() {
        assertTrue(c.canPermutePalindrome("aab"));

    }
    @Test
    public void test_carerac() {
        assertTrue(c.canPermutePalindrome("carerac"));
    }
}