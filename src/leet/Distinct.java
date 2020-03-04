package leet;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> result = new HashSet<>();
        for(int n : A) {
            result.add(n);
        }
        return result.size();
    }
}
