package leet;

public class CyclicRotation {
    // 주어진 배열을 0번부터 새로운 배열 위치에 인서트. 넣는 위치는 modular로 해결
    public int[] solution(int[] A, int K) {
        int len = A.length;
        if (len - K == 0 || len == 0){
            return A;
        }

        int [] result = new int[len];
        for (int i = 0; i< len;i++) {
            int flag = K + i;
            if (flag >= len) {
                flag = flag % len;
            }
            result[flag] = A[i];
        }
        return result;

    }

}
