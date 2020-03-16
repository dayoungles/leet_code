package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumUniqueEmailsTest {
    NumUniqueEmails n = new NumUniqueEmails();
    @Test
    public void test_Unique() {
        String[] input = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int result = n.numUniqueEmails(input);
        assertEquals(2, result);


    }
    @Test
    public void test_wrongAnswer() {
        String[] input = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        int result = n.numUniqueEmails(input);
        assertEquals(1, result);
    }
}