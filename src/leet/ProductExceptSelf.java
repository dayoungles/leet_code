package leet;

public class ProductExceptSelf {
    public int[] productExceptSelf_giveup_dueto_exception(int[] nums) {
        if (nums.length == 0) return null;
        int wholeProduct = -1;
        int wholeProductExceptZero = -1;
        int[] output = new int[nums.length];
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                continue;
            }
            if (wholeProductExceptZero == -1 && wholeProduct == -1) {
                wholeProductExceptZero = num;
                wholeProduct = num;
            } else {
                wholeProductExceptZero = wholeProductExceptZero*num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroCount != 0) {
                    output[i] = 0;
                } else {
                    output[i] = wholeProductExceptZero;
                }
            } else {
                output[i] = wholeProductExceptZero / nums[i];
            }
        }

        return output;
    }
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] =1;
        right[nums.length-1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        for (int i = nums.length-2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i+1];
        }
        for(int i = 0; i< nums.length; i++){
            nums[i] = left[i] * right[i];
        }

        return nums;
    }
}
