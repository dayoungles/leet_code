package leet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubrectangleQueriesTest {
    SubrectangleQueries sq;
    @Before
    public void setUp() throws Exception {
//        [[[[1,2,1],[4,3,4],[3,2,1],[1,1,1]]],[0,2],[0,0,3,2,5],[0,2],[3,1],[3,0,3,2,10],[3,1],[0,2]]
        int[] row1 = new int[]{1,1,1};
        int[] row2 = new int[]{2,2,2};
        int[] row3 = new int[]{3,3,3};
        int[][] mat = new int[][]{row1, row2, row3};
        sq = new SubrectangleQueries(mat);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updateSubrectangle() {
        int[] update = new int[]{0, 0, 2, 2, 100};

        sq.updateSubrectangle(update[0], update[1], update[2], update[3], update[4]);
    }

    @Test
    public void getValue() {
        System.out.println(sq.getValue(0, 2));
    }
}