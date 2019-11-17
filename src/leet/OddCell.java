package leet;

public class OddCell {
    public int oddCells(int n, int m, int[][] indices) {
        int oddCount = 0;
        int resultRow[] = new int [n];
        int resultCol[] = new int [m];

        for (int idxnum = 0; idxnum < indices.length; idxnum++) {
            int row = indices[idxnum][0];
            int col = indices[idxnum][1];
            resultRow[row]++;
            resultCol[col]++;
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j< m; j++){
                if((resultRow[i]+resultCol[j])%2!=0)
                    oddCount++;
            }
        }
        return oddCount;
    }
}
