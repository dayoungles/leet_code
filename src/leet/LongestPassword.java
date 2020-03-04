package leet;

import com.sun.xml.internal.ws.util.StringUtils;

public class LongestPassword {
    public int solution(String S) {
        String[] splited = S.split(" ");
        int length = -1;
        for(String word: splited) {
            int wordLen = 0;
            if(isValidPassword(word)) {
                wordLen = word.length();
            } else {
                wordLen = -1;
            }
            if(length < wordLen) {
                length = wordLen;
            }
        }
        return length;
    }

    private boolean isValidPassword(String word) {
        //숫자가 없으면 안됨
        if(!word.matches(".*\\d.*")) {
            return false;
        }

        //알파누메리컬 캐릭터가 있으면 안됨
        if(word.matches("^\\W*$")) {
            return false;
        }

        return true;
    }
}
