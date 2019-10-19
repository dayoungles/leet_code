package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class UncommonWordTest {
    @Test
    public void test_uncommonFromSentences() {
        UncommonWord uncommon = new UncommonWord();
        uncommon.uncommonFromSentences("this apple is sour", "this apple is sweet");

    }

}