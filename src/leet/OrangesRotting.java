package leet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        int round = 0;
        int unrotten = 0;
        List<Orange> oranges= new ArrayList();
        List<List<Orange>> orangeList = new ArrayList<>();


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int orange = grid[i][j];

                if(orange == 2) {
                    Orange o = new Orange(i, j, round);
                    orangeList.add(o);
                }

                if (orange == 1) {
                    unrotten++;
                }
            }
        }
        return 0;
    }

    private class Orange {
        int row;
        int col;
        int rottenRound;

        public Orange(int row, int col, int rottenRound) {
            this.row = row;
            this.col = col;
            this.rottenRound = rottenRound;
        }

        public void setRottenRound(int rottenRound) {
            this.rottenRound = rottenRound;
        }

        public int getRottenRound() {
            return this.rottenRound;
        }
    }
}
