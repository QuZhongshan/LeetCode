public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        
        int sell1 = 0, buy1 = Integer.MIN_VALUE;
        int sell2 = 0, buy2 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        
        return sell2;
    }
}

参考资料：LeetCode中的Solutions

时间复杂度：O(n)

动态规划的典型问题，具体看看参考资料。