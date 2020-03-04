package leet;

public class MaximumProductThree {
    public int solution(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< A.length-2; i++) {
            int first = A[i];
            for(int j = i+1; j< A.length-1; j++){
                int second = A[j];
                for(int k = j+1; k< A.length; k++) {
                    int third = A[k];
                    if(first*second*third >max) {
                        max = first*second*third;
                    }
                }
            }
        }
        return max;
    }

    /*
    소팅한 다음에
    0, 1, n-1번째 (마이너스가 있을 경우)
    or n-3, n-2 n-1 번쨰 제일 큰거

     */
}
