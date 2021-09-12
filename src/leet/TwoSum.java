package leet;

import com.sun.tools.corba.se.idl.ExceptionGen;

import java.util.*;

public class TwoSum {
    public int[] twoSum20210913(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
//            int pair = map.get(target - nums[i]);
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    public int[] twoSum20200912(int[] nums, int target) throws Exception {
        if(nums == null || nums.length == 0) return null;
        //2, 7, 11, 15
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if( map.containsKey(target- n)) {
                int[] answer = {i, map.get(target-n)};
                return answer;
            }
            map.put(n, i);
        }
        return null;
    }
    public int[] twoSum20200910(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
            map.put(target-nums[i], i);
        }

        return null;
    }


    public int[] twoSum_original(int[] nums, int target) throws Exception {
        for (int i = 0; i< nums.length; i++){
            int rather = target- nums[i];

            for (int j = i; j < nums.length; j++){
                if (rather == nums[j]){
                    int[] li = new int[2];
                    li[0] = i;
                    li[1] = j;

                    return li;
                }
            }
        }
        throw new Exception();
    }

    public int[] twoSum_upgraded(int[] nums, int target) throws Exception {

        HashMap<Integer, Integer> mapper = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int remain = target - nums[i];
            if (mapper.containsKey(remain)){
                int[] answer = new int[2];
                answer[0] = mapper.get(remain);
                answer[1] = i;
                return answer;
            }

            mapper.put(nums[i], i);
        }

        throw new Exception();
    }

    public int[] twoSum3(int[] nums, int target)  {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])) {
                int[] result = {i, map.get(target-nums[i])};
                return result;
            }
            map.put(nums[i], i);
        }

        return null;

    }
}
