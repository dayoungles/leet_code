package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        MergeSortedArray a = new MergeSortedArray();
        int[] nums1 = {0};
        int[] nums2 = {1, 3,4,5};
        int m = nums1.length;
        int n = nums2.length;
        a.merge(nums1, m, nums2, n);
    }
}