package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMedianSortedArraysTest {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        FindMedianSortedArrays f = new FindMedianSortedArrays();
        int result = (int)f.findMedianSortedArrays(nums1, nums2);

        assertEquals(2, result);

    }

    @Test
    public void findMedianSortedArrays1() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        FindMedianSortedArrays f = new FindMedianSortedArrays();
        double result = f.findMedianSortedArrays(nums1, nums2);
        assertEquals("2.5",Double.toString(result));

    }
}