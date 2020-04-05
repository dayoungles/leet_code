package leet;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class AddStringsTest {
    AddStrings a;
    String input1;
    String input2;

    @Before
    public void setup () {
        a = new AddStrings();
    }

    @Test
    public void test_addStrings() {
        input1 = "123";
        input2 = "111";
        assertThat(a.addStrings(input1, input2), is("234"));
    }

    @Test
    public void test_up() {
        input1 = "129";
        input2 = "111";
        assertThat(a.addStrings(input1, input2), is("240"));
    }

    @Test
    public void test_onlyOnelongString() {
        input1 = "12900000000000000100000000003200000000000000000";
        input2 = "111";
        assertThat(a.addStrings(input1, input2), is("12900000000000000100000000003200000000000000111"));
    }

    @Test
    public void test_failedInLetCodeWithHeadZero() {
        input1 = "9";
        input2 = "99";
        assertThat(a.addStrings(input1, input2), is("108"));
    }
}