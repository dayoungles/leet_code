package leet;

import org.junit.Test;

import static org.junit.Assert.*;
public class NewJewelsInStonesTest {
    NewJewelsInStones js = new NewJewelsInStones();

    @Test
    public void numJewelsInStones() {
        String j = "aA";
        String s = "aAAbbbb";
        assertEquals(3, js.numJewelsInStones(j, s));

    }

    @Test
    public void test_secondExample() {
        String j = "z";
        String s = "ZZ";
        assertEquals(0, js.numJewelsInStones(j, s));
    }
}