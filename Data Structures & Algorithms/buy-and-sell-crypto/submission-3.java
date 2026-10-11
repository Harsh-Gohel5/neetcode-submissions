// class Solution {
//     public int maxProfit(int[] prices) {
//         int minprice = Integer.MAX_VALUE;
//         int maxprofit = 0;
//         for (int i = 0; i < prices.length; i++) {
//             if (prices[i] < minprice)
//             minprice = prices[i];
//             else if (prices[i] - minprice > maxprofit)
//             maxprofit = prices[i] - minprice;
//         }
//         return maxprofit;
//     }
// }

public class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 0, maxP = 0;
        // int r = 1;
        // int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}