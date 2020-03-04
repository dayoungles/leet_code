package leet;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length ==1) return nums[0];

        int before1 = 0;
        int before2 = 0;

        for(int i = 0; i< nums.length; i++){
            int value = nums[i];
            int tmp = before1;

            before1 = before2+value;
            before1 = Math.max(before1, tmp);
            before2 = tmp;


        }

        return Math.max(before1, before2);
    }

}
