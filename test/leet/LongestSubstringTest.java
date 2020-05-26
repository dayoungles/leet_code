package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {
    LongestSubstring a = new LongestSubstring();
    @Test
    public void lengthOfLongestSubstring() {
        assertEquals(a.lengthOfLongestSubstring("abcabcbb"), 3);
    }

    @Test
    public void test_oneCharacterRepeated() {
        assertEquals(a.lengthOfLongestSubstring("bbbb"), 1);
    }

    @Test
    public void test_samplecase2() {
        assertEquals(a.lengthOfLongestSubstring("pwwkew"), 3);
    }

    @Test
    public void test_space() {
        assertEquals(a.lengthOfLongestSubstring(" "), 1);
    }

    @Test
    public void test_movedStartIdx() {
        assertEquals(a.lengthOfLongestSubstring("dvdf"), 3);
    }

}