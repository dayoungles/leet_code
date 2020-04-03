package leet;

import java.lang.reflect.Array;
import java.util.*;

public class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        int round = 0;
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1)
                    fresh++;
            }
        }

        for(int oldFresh= fresh; oldFresh>0; round++, oldFresh=fresh){
            for(int i = 0; i< grid.length; i++){
                for(int j = 0; j< grid[i].length; j++){
                    if(grid[i][j] == round+2) {
                        fresh -= rot(grid, i+1, j, round) +
                                rot(grid, i-1, j, round) +
                                rot(grid, i, j+1, round) +
                                rot(grid, i, j-1, round);

                    }
                }
            }
            if(fresh == oldFresh) return -1;
        }

        return round;
    }

    private int rot(int[][] grid, int i, int j, int day) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j] != 1)
            return 0;
        grid[i][j] = day + 3;
        return 1;
    }

}
