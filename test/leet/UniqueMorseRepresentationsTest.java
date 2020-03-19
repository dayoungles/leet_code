package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueMorseRepresentationsTest {
    UniqueMorseRepresentations u = new UniqueMorseRepresentations();

    @Test
    public void uniqueMorseRepresentations() {
        String[] input = {"gin", "zen", "gig", "msg"};
        assertEquals(2, u.uniqueMorseRepresentations(input));
    }
}
