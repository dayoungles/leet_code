package leet;

import java.util.*;

public class UncommonWord {

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : A.split(" ")) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, 0);
            }
        }

        for (String word : B.split(" ")) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, 0);
            }
        }

        List<String> array = new LinkedList<>();

        for (String word: map.keySet()){
            if (map.get(word) == 1){
                array.add(word);
            }
        }

        return array.toArray(new String[array.size()]);

    }
}
