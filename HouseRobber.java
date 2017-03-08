public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        
        return dp[nums.length - 1];
    }
}

参考资料：http://www.programcreek.com/2014/03/leetcode-house-robber-java/

时间复杂度：O(n)

典型的动态规划问题，关键在于确定递推量和递推公式，在这里递推量为到i为止的最大的钱数dp[i]，
初始条件为dp[0]和dp[1]，因为不能同时抢劫彼此相邻的两所房子，所以递推公式为
max{dp[i - 1], dp[i - 2] + nums[i]}，至此即可求解了。

还是不太清楚，赶快总结，动态规划是很经典也是必须要掌握的算法。