package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubdomainVisitsTest {

    @Test
    public void subdomainVisits() {
        SubdomainVisits s = new SubdomainVisits();
//        String[] a = {"9001 discuss.leetcode.com"};
        String[] a = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(s.subdomainVisits(a));
    }
}