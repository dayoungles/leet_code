package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramMappingTest {
    AnagramMapping a = new AnagramMapping();

    @Test
    public void anagramMappings() {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        int[] expect = {1, 4, 3, 2, 0};
        assertEquals("should be same", expect[0], a.anagramMappings(A,B)[0]);
        assertEquals("should be same", expect[1], a.anagramMappings(A,B)[1]);
        assertEquals("should be same", expect[2], a.anagramMappings(A,B)[2]);
        assertEquals("should be same", expect[3], a.anagramMappings(A,B)[3]);
        assertEquals("should be same", expect[4], a.anagramMappings(A,B)[4]);
    }
}