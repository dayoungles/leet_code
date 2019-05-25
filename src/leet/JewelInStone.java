package leet;

import java.util.ArrayList;

public class JewelInStone {
    public int numJewelsInStones(String J, String S) {
        // put each character of J into array: J length under 50
        ArrayList<Character> jewel = new ArrayList<>();
        int wholeCount = 0;
        for (int i = 0; i < J.length(); i++) {
            jewel.add(J.charAt(i));
        }

        // compare S character into jewel Arrays
        for (int i = 0; i< S.length(); i++) {
            char stone = S.charAt(i);

            if (jewel.indexOf(stone) != -1){
                wholeCount++;
            }
        }
        return wholeCount;
    }
}
