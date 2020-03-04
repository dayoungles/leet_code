package leet;

import java.util.Stack;

public class VoraciousFishes {
    public int solution(int[] A, int[] B) {
        if(A.length == 1) return 1;
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i< A.length; i++){
            if(s.isEmpty()){
                s.push(i);
            } else {
                int idx = s.peek();

                if(B[idx]==1&& B[i]==0) {

                }
            }

        }

        return 0;
    }

}
