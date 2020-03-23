package leet;

import sun.awt.image.ImageWatched;

import java.util.*;

public class SortedSquares {
    public int[] sortedSquares_easy(int[] A) {
        List<Integer> list = new ArrayList<>();

        for (int i:A) {
            list.add(i*i);
        }

        Collections.sort(list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int[] sortedSquares_linkedlist(int[] A) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i:A) {
            int current = 0;
            int idx = 0;

            for(int j = 0; j < list.size(); j++) {
                current = list.get(j);
                if (current >= i * i) {
                    break;
                }
                idx++;
            }
            list.add(idx, i*i);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int[] sortedSquares_solutionWithMergeSort(int[] A) {
        int head = 0;
        int tail = A.length-1;
        int[] answer = new int[A.length];
        int answerIdx = A.length-1;

        while(head <= tail) {
            int headSquared = A[head]*A[head];
            int tailSquared = A[tail]*A[tail];

            if(headSquared >= tailSquared) {
                answer[answerIdx] = headSquared;
                head++;
            } else {
                answer[answerIdx] = tailSquared;
                tail--;
            }
            answerIdx--;
        }

        return answer;
    }
}
