package leet;

import javafx.util.Pair;

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

    public int orangesRottingWithQueue(int[][] grid) {
        Queue<Pair<int[], Integer>> q = new LinkedList<>();
        int fresh = 0;
        int round = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int orange = grid[i][j];
                if(orange == 2) {
                    q.add(new Pair(new int[] {i, j}, 0));
                }
                if (orange == 1) {
                    fresh++;
                }
            }
        }

        while(!q.isEmpty()) {

            Pair<int[], Integer> p = q.poll();
            int row = p.getKey()[0];
            int col = p.getKey()[1];
            int rottenRound = p.getValue();

            round = rottenRound;
            //upper i-1, j
            if(row -1 >= 0 && grid[row-1][col] == 1) {
                grid[row-1][col] = 2;
                fresh--;
                q.add(new Pair (new int [] {row - 1, col}, rottenRound +1));
            }
            //below i+1, j
            if(row +1 < grid.length && grid[row+1][col] == 1) {
                grid[row+1][col] = 2;
                fresh--;
                q.add(new Pair(new int[] {row + 1, col}, rottenRound +1));
            }
            //left i, j-1
            if(col -1 >= 0 && grid[row][col-1] == 1) {
                grid[row][col-1] = 2;
                fresh--;
                q.add(new Pair(new int[] {row, col - 1}, rottenRound +1));
            }
            //right i, j+1
            if(col +1 < grid[row].length && grid[row][col+1] == 1) {
                grid[row][col +1] = 2;
                fresh--;
                q.add(new Pair(new int[]{row, col + 1}, rottenRound+1));
            }

        }

        return (fresh > 0) ? -1:round;
    }

}
