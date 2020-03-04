package leet;

import java.util.Arrays;

public class PermMIssingElem {
    public int solution(int[] A) {
        //고려해야 했던 예외조건들
        /*
        어레이 인자가 1개
        인자가 2개
        인자가 1개인데 값이 2일 때
        첫번째, 마지막 인자가 없을 떄
        empty array
        큰 범위
         */
        System.out.println(A);

        if(A == null || A.length ==0) {
            return 1;
        }

        if(A.length == 1) {
            return 1;
        }

        Arrays.sort(A);

        if (A[0] != 1) {
            return 1;
        }
        for(int i=0; i< A.length; i++) {
            if (A[i]+1 != A[i+1]) {
                System.out.println(A[i]+1);
                return A[i] +1;
            }
        }
        return A[A.length-1]+1;
    }
}
