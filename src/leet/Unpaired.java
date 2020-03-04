package leet;

import java.lang.reflect.Array;
import java.util.*;

public class Unpaired {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i< A.length; i++){
            if(set.contains(A[i])) {
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
            ArrayList a  = new ArrayList();
            a.contains(1);
        }
        for (int val: set) {
            return val;
        }
        return 0;
    }
}
