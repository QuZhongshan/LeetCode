public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        int res = 1;
        for (int len : dp) {
            if (len > res)
                res = len;
        }
        
        return res;
    }
}

参考资料：http://www.programcreek.com/2014/04/leetcode-longest-increasing-subsequence-java/

时间复杂度：不太清楚

经典的动态规划题目，具体看参考资料和自己写的算法总结。