package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {
    LongestPalindrome l;
    String input;
    @Before
    public void setup () {
        l =  new LongestPalindrome();
    }
    @Test
    public void longestPalindrome_sample1() {
        input = "babad";
        String result = l.longestPalindrome(input);
        boolean twoResult = (result.equals("bab") || result.equals("aba"));

        assertTrue(twoResult);
    }

    @Test
    public void test_sample2() {
        input = "cbbd";
        String result = l.longestPalindrome(input);

        assertEquals("bb", result);

    }
}