package leet;

import java.util.Stack;

public class StrSymmetryPoint {
    public int solution(String S) {
        if(S.length() == 1) return 0;
        if(S=="") return -1;
        if(S.length() % 2 == 0) return -1;

        int head = 0;
        int tail = S.length() -1;

        while(head <S.length() /2) {
            if(S.charAt(head) != S.charAt(tail)) {
                return -1;
            }

            head++;
            tail--;
        }

        return S.length()/2;
    }
}
