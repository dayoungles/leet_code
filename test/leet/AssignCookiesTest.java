package leet;

import org.junit.Before;
import org.junit.Test;

public class AssignCookiesTest {
    int[] g = {1,2,3};
    int[] d = {1,1};



    @Test
    public void test_Assign () {
        AssignCookies a = new AssignCookies();
        a.findContentChildren(g, d);
    }

}