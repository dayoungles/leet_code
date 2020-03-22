package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTimeTest {
    CalculateTime c;
    String keyboard;
    String word;

    @Before
    public void create () {
        c = new CalculateTime();

    }

    @Test
    public void calculateTime() {
        keyboard = "abcdefghijklmnopqrstuvwxyz";
        word = "cba";
        int result = c.calculateTime(keyboard, word);
        assertEquals(4 , result);
    }

    @Test
    public void test_ex2() {
        keyboard = "pqrstuvwxyzabcdefghijklmno";
        word = "leetcode";
        int result = c.calculateTime(keyboard, word);
        assertEquals(73, result);

    }
}