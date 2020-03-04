package leet;

import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i =0; i< s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            } else {
                int idx = map.get(s.charAt(i));
                max = i- idx+1;


            }
        }

        return 0;

    }
}
