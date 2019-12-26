package leet;

import java.util.*;

public class NotExistInteger {
    public int solution(int [] A) {
        HashSet<Integer> set = new HashSet<>();
        int biggest = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] <  0) {
                continue;
            }
            biggest = A[i];

            for (int j = 0; j < biggest; j++){
                if (set.contains(j)) {

                }
            }
        }

        for (int i; i< 1000000; i++){

        }

        return 0;
    }
}
