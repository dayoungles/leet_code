package leet;

public class Triangle {
    public int solution(int[] A) {
        for(int i = 0; i< A.length-2; i++) {
            int first = A[i];
            for(int j = i+1; j< A.length-1; j++){
                int second = A[j];
                for(int k = j+1; k< A.length; k++) {
                    int third = A[k];
                    if((first + second > third) &&
                            (second + third)> first &&
                            (first + third) > second)  {

                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}

/*
소팅
A[i+2]-[i+1] < A[i] && A[i]=>0 조건...
A[i+2]-[i+1] < A[i] && A[i]=>0 조건...
 */