package leet;



public class MaxIncreaseKeepingSkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int gridLength = grid.length;
        int[] rowMaxes = new int[gridLength];
        int[] colMaxes = new int[gridLength];

        for (int i = 0; i < gridLength; i++){
            for (int j = 0; j < gridLength; j++){
                rowMaxes[i] = Math.max(rowMaxes[i], grid[i][j]);
                colMaxes[j] = Math.max(colMaxes[j], grid[i][j]);
            }
        }

        int result = 0;
        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridLength; j++) {
                result += Math.min(rowMaxes[i], colMaxes[j]) - grid[i][j];
            }
        }
        return result;
    }
}
