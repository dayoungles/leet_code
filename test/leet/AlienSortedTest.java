package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlienSortedTest {

    @Test
    public void isAlienSorted() {
        AlienSorted a = new AlienSorted();
        String[] words = {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String order = "zkgwaverfimqxbnctdplsjyohu";



        a.isAlienSorted(words, order);
    }
}