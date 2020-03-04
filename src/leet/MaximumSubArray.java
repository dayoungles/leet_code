package leet;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {






        //맞는거
        int max = nums[0];
        int curr = nums[0];

        for(int i =1; i<= nums.length-1; i++){
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);

        }
        return max;
    }

}
