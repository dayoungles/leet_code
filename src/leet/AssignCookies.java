package leet;

import java.util.*;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greedIdx = 0;
        int sizeIdx= 0;
        int count = 0;

        while (greedIdx < g.length && sizeIdx < s.length){
            int gg = g[greedIdx];
            int ss = s[sizeIdx];
            if (g[greedIdx] <= s[sizeIdx]) {
                count++;
                greedIdx++;
                sizeIdx++;
            } else {
                sizeIdx++;
            }
        }

        System.out.println(count);
        return count;
    }

    public Map<Integer, Integer> createGreedMap(int[] g) {
        Map<Integer, Integer> sortedGreed = new HashMap<>();

        for(int i = 0; i< g.length; i++){
            sortedGreed.put(g[i], sortedGreed.getOrDefault(g[i], 0) +1);
        }

        return sortedGreed;
    }
}