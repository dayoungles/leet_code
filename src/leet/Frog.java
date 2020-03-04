package leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Frog {
    public int solution(int X, int[]A){
        Set<Integer> leaves = new HashSet<>();
        for(int i=0; i < A.length; i++) {
            leaves.add(A[i]);
            boolean a = leaves.contains(X);
            int size = leaves.size();
            if (a && size == X)  return i;
        }

        return -1;
    }
}
