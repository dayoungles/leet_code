package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckInclusionTest {

    @Test
    public void checkInclusion_ex1() {
        CheckInclusion i = new CheckInclusion();
        String input1 = "ab";
        String input2 = "eidbaooo";
        assertTrue(i.checkInclusion(input1, input2));
    }

    @Test
    public void checkInclusion_ex2() {
        CheckInclusion i = new CheckInclusion();
        String input1 = "ab";
        String input2 = "eidboaoo";
        assertFalse(i.checkInclusion(input1, input2));
    }

}