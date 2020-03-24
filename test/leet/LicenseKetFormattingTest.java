package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LicenseKetFormattingTest {
    LicenseKetFormatting l;
    String s;
    int k;

    @Before
    public void createBefore() {
        l = new LicenseKetFormatting();
    }

    @Test
    public void licenseKeyFormatting() {
        s = "5F3Z-2e-9-w";
        k = 4;

        String result = l.licenseKeyFormatting(s, k);
        assertEquals("5F3Z-2E9W", result);
    }

    @Test
    public void test_second() {
        s = "2-5g-3-J";
        k = 2;

        String result = l.licenseKeyFormatting(s, k);
        assertEquals("2-5G-3J", result);
    }


    @Test
    public void test_failed() {
        s = "---";
        k = 3;

        String result = l.licenseKeyFormatting(s, k);
        assertEquals("", result);
    }

    @Test
    public void test_failed2() {
        s = "--------";
        k = 100;

        String result = l.licenseKeyFormatting(s, k);
        assertEquals("", result);
    }


}