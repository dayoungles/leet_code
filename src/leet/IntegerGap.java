package leet;

public class IntegerGap {
    public int solution(int N) {
        int gap = 0;
        String bin = Integer.toBinaryString(N);

        for (int i = 0; i < bin.length(); i++) {
            char eachBinary = bin.charAt(i);
            if (eachBinary == '1') {
                int gapCount = 0;
                for(int j = i+1; j < bin.length(); j++){
                    if (bin.charAt(j) == '0'){
                        gapCount++;
                    } else {
                        if (gap < gapCount) {
                            gap = gapCount;
                        }
                        gapCount = 0;
                        i = j;
                    }
                }
            }
        }
        System.out.println(gap);
        return gap;
    }

}
