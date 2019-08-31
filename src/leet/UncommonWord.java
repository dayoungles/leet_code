package leet;

import java.util.*;

public class UncommonWord {

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        List<String> aResult = new ArrayList<String>(Arrays.asList(A.split(" ")));
        List<String> bResult = new ArrayList<String>(Arrays.asList(B.split(" ")));

        for (String word : aResult) {
            map.put(word, map.getOrDefault(word, 0) +1);
        }

        for (String word : bResult) {
            map.put(word, map.getOrDefault(word, 0) +1);
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
