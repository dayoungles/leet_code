package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCellTest {

    int n = 2, m = 3;
    int[][] indices = {{0,1},{1,1}};

    @Test
    public void test () {
        OddCell oc = new OddCell();
        oc.oddCells(n, m, indices);
    }
}