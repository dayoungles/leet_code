package leet;

import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() ==1) return s.length();
        Set<Character> existSet = new HashSet<>();
        int max = 0;
        int startIdx = 0;
        int endIdx = 0;

        while(endIdx < s.length() && startIdx < s.length()){
            if(existSet.contains(s.charAt(endIdx))){
                existSet.remove(s.charAt(startIdx++));
            }else {
                existSet.add(s.charAt(endIdx++));
                max = Math.max(endIdx - startIdx, max);
            }
        }
        return max;
    }
}