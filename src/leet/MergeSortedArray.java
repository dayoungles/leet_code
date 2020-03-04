package leet;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) {
            return;
        }
        int pos1 = 0;
        int pos2 = 0;
        while(pos1 < (m+n-1)) {
            int n1 = nums1[pos1];
            int n2 = nums2[pos2];
            if(n1 <= n2){
                pos1++;
            } else if(n1 > n2) {
                int tmp = n1;
                nums1[pos1] = n2;
                nums2[pos2] = tmp;
                pos1++;
            }
        }
        if(pos2 < n) {
            for (int i = pos2; i< n; i++){
                nums1[pos1] = nums2[i];
                pos1++;
            }
        }

        System.out.println(nums1);

        return;
    }
}
