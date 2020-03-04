package leet;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int solution(int[] A) {
        if (A == null) return -1;

        Map<Integer, Integer> result = new HashMap<>();

        for (int n : A) {
            result.put(n, result.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer, Integer> kv: result.entrySet()) {
            if(kv.getValue() >= A.length/2) {
                for(int i = 0; i< A.length; i++) {
                    if (A[i] == kv.getKey()) {
                        return i;
                    }
                }
            }
        }
        return 0;
    }
}
