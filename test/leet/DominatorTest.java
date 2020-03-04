package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class DominatorTest {

    @Test
    public void solution() {
        Dominator a = new Dominator();
        int[] b = {3,4,3,2,3,1,1,2,3,4,3};
        System.out.println(a.solution(b));
    }
}