package leet;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        char startIndex = 'a';
        String[] morseTable = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> morseSet = new HashSet<>();

        for (String word: words) {
            StringBuffer sb = new StringBuffer();

            for (char alphabet : word.toCharArray()) {

                sb.append(morseTable[alphabet - startIndex]);
            }
            String morseConverted = sb.toString();
            morseSet.add(morseConverted);
        }

        return morseSet.size();
    }
}
