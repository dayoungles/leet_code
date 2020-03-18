package leet;

import java.util.HashMap;
import java.util.Map;

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
}
