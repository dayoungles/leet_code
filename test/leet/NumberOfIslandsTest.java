package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {
    NumberOfIslands tt = new NumberOfIslands();

    @Test
    public void numIslands() {
        char[] a = {'1','1','1','1','0'};
        char[] b = {'1','1','0','1','0'};
        char[] c = {'1','1','0','0','0'};
        char[] d = {'0','0','0','0','0'};

        char[][] input = {a, b, c, d};


        tt.numIslands(input);
    }
}