package leet;

import java.util.HashMap;
import java.util.Map;

public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int count = 0;
        for (char input :
                map.keySet()) {
            count += map.get(input) % 2;

        }

        if (count <= 1 ){
            return true;
        }
        return false;

    }
}
