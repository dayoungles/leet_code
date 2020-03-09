package leet;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> checkSet = new HashSet<>();

        for(int num : nums){
            if(checkSet.contains(num)) {
                return true;
            }
            checkSet.add(num);
        }

        return false;
    }
}
