package leet;

import com.sun.tools.corba.se.idl.ExceptionGen;

import java.util.HashMap;

public class TwoSum {
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
}
