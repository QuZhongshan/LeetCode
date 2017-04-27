public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        
        int min = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        
        return res;
    }
}

参考资料：http://www.programcreek.com/2014/02/leetcode-best-time-to-buy-and-sell-stock-java/

时间复杂度：O(n)

具体看算法总结。