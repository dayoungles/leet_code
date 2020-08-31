package leet;

import java.util.ArrayList;
import java.util.List;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < nums1.length && idx2 < nums2.length) {
            int n1 = nums1[idx1];
            int n2 = nums2[idx2];

            if (n1> n2) {
                list.add(n2);
                idx2++;
            } else {
                list.add(n1);
                idx1++;
            }
        }

        if (nums1.length > idx1) {
            while (idx1 < nums1.length) {
                list.add(nums1[idx1]);
                idx1++;
            }
        } else if(nums2.length > idx2) {
            while(idx2 < nums2.length) {
                list.add(nums2[idx2]);
                idx2++;
            }
        }

        //list median
        int midIdx = list.size()/2;
        double mid = list.get(midIdx);
        if(list.size() %2 == 0) {
            double mid1 = list.get(midIdx-1);
            double mid2 = list.get(midIdx);
            mid = (mid1+mid2) / (double)2 ;
        }
        return mid;
    }
}
