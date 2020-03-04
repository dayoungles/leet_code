package leet;

import java.util.HashMap;
import java.util.Map;

public class TapeEquilibrium {
    public int solution(int[] A) {


        int head = 0;
        int tail=0;
        int smallest = 0;

        for(int i = 0; i< A.length; i++){
            tail +=A[i];
        }

        for (int i = 0; i< A.length-1; i++){
            head += A[i];
            tail -= A[i];

            if(Math.abs(head-tail) < smallest) {
                smallest = Math.abs(head-tail);
            }
        }
        return smallest;
    }

//    int minimum = A.length*1000;
//    int head = 0;
//    int tail = 0;
//        for (int i = 0; i<A.length; i++) tail+= A[i];
//        for(int i = 0; i<A.length-1; i++){
//        head+= A[i];
//        tail-= A[i];
//        if (minimum>Math.abs(head-tail)) minimum = Math.abs(head-tail);
//    }
//        return minimum;
}
