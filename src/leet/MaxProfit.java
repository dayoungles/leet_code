package leet;

public class MaxProfit {
    public int maxProfit20191230(int[] prices) {
        if(prices == null) return 0;
        //
        int cur = prices[1]-prices[0];
        int max = cur;

        for (int i = 1; i< prices.length-1; i++){
            int diff = prices[i+1]-prices[i];
            cur = Math.max(diff, diff+cur);
            max = Math.max(cur, max);
        }
        return max;

    }

    public int maxProfit(int[] prices) {
        if (prices == null) return 0;
        int maxIdx=0;
        int minIdx=0;
        int result = 0;
        for(int i = 1; i< prices.length; i++){
            int price = prices[i];

            if(price >= prices[maxIdx]) {
                maxIdx = i;
            }
            if(price <= prices[minIdx]) {
                minIdx = i;
            }

            if(minIdx >= maxIdx) {
                maxIdx = minIdx;
            }

            if(result < prices[maxIdx]-prices[minIdx]) {
                result = prices[maxIdx]-prices[minIdx];
            }
        }
        return result;

        // codility
        /*
        if(nums == null) return 0;
        //
        int cur = nums[1]-nums[0];
        int max = cur;

        for (int i = 1; i< nums.length-1; i++){
            int diff = nums[i+1]-nums[i];
            cur = Math.max(diff, diff+cur);
            max = Math.max(cur, max);
        }
        return max;
         */
    }

    //
}
