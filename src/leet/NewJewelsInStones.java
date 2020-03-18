package leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> stoneMap = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            stoneMap.put(S.charAt(i), stoneMap.getOrDefault(S.charAt(i), 0)+1);
        }
        int count = 0;

        for (int i = 0; i < J.length(); i++) {
            count += stoneMap.getOrDefault(J.charAt(i), 0);
        }

        return count;
    }

    public int reduceMemoryUsage(String J, String S) {
        int count = 0;
        for (char c : S.toCharArray()) {
            if(J.indexOf(c) != -1) count++;
        }


        return count;
    }

    public int numJewelsInStones2(String J, String S) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (char c: J.toCharArray() ) {
            set.add(c);
        }
        for (char s : S.toCharArray()) {
            if(set.contains(s)) result++;
        }
        return result;
    }
}
