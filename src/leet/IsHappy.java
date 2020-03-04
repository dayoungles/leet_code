package leet;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public boolean isHappy(int n){
        if(n == 0) return false;
        if(n == 1) return true;
        HashSet<Integer> result = new HashSet<>();
        boolean isRepeated = false;

        int sum = 0;
        while(isRepeated == false) {
            while (n != 0) {
                sum += Math.pow((n % 10),2);
                n = n / 10;
            }
            if (sum == 1) return true;

            if (result.contains(sum)) {
                return false;
            }
            result.add(sum);
            n = sum;
            sum = 0;
        }

        return true;
    }


}
