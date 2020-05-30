package leet;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int islandCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                char isIsland= grid[i][j];
                grid[i][j] = 0;
                if(isIsland == '1') {
                    islandCount++;
                    queue.add(new int[] {i, j});
                    while(!queue.isEmpty()){
                        int[] counted = queue.poll();
                        int row = counted[0];
                        int col = counted[1];
//                        위
                        if(row -1 >=0 && grid[row-1][col]=='1'){
                            queue.add(new int[] {row-1, col});
                            grid[row-1][col] ='0';
                        }
//                        아래
                        if(row+1 < grid.length && grid[row+1][col] =='1') {
                            queue.add(new int[]{row + 1, col});
                            grid[row+1][col] = '0';
                        }
//                        좌
                        if(col-1 >=0 && grid[row][col-1] =='1'){
                            queue.add(new int[]{row, col - 1});
                            grid[row][col - 1]= '0';
                        }
//                        우
                        if(col+1 <grid[i].length && grid[row][col+1] =='1') {
                            queue.add(new int[]{row, col + 1});
                            grid[row][col+1] = '0';
                        }
                    }
                }
            }
        }

        return islandCount;
    }
}
