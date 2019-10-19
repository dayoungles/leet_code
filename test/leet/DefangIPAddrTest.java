package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefangIPAddrTest {

    @Test
    public void testDefang(){
        DefangIPAddr ipAddr = new DefangIPAddr();
        ipAddr.defangIPaddr("1.1.1.1");
    }
}