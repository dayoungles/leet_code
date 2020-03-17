package leet;

import java.util.HashMap;
import java.util.Map;

public class AnagramMapping {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] answer = new int[A.length];
        if (A.length == 0) return null;

        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            numberMap.put(B[i], i);
        }

        for (int i = 0; i < A.length; i++) {
            answer[i]= numberMap.get(A[i]);
        }

        return answer;

    }
}
