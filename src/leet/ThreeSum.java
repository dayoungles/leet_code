package leet;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
//
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> temp = new HashSet<>();
        int start;
        int sec;
        int third;
        for(int pos = 0; pos < nums.length-2; pos++ ) {
            int targetSum = 0 - nums[pos];
            for(int i =pos +1; i< nums.length-1; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    if(nums[i]+ nums[j] == targetSum) {
                        List<Integer> set = new ArrayList<>();
                        set.add(nums[pos]);
                        set.add(nums[i]);
                        set.add(nums[j]);
                        Collections.sort(set);
                        if (!temp.contains(set)) {
                            temp.add(set);
                            result.add(set);
                        }
                    }
                }
            }
        }
        return result;



//            for(int i=s+1; i< nums.length-1; i++){
//                sec = nums[i];
//                for(int j = i+1; j<= nums.length; j++){
//                    third = nums[j];
//                    if((start + sec + third) == 0) {
//                        List<Integer> set = new ArrayList<>();
//                        set.add(start);
//                        set.add(sec);
//                        set.add(third);
//                        result.add(set);
//
//                        break;
//                    }
//                }
//
//                if(i == nums.length-2) {
//                    break;
//                }
//            }
//        }
//        return result;
    }
}
