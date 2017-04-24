public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0)
                total += prices[i + 1] - prices[i];
        }
        
        return total;
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3877065.html

时间复杂度：O(n)

这道题目是贪心算法的典型问题，理解起来如果有困难可以看看资料，里面讲解的非常清楚。