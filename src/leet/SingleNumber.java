package leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> m = new HashMap<>();
        for(int a: nums) {
            if(!m.containsKey(a)){
                m.put(a, 1);
            } else {
                m.remove(a);
            }
        }

        for(int key: m.keySet()){
            return key;
        }
        return 0;
    }
}
