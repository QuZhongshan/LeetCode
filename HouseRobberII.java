public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        
        int max1 = helper(nums, 0, nums.length - 2);
        int max2 = helper(nums, 1, nums.length - 1);
        
        return Math.max(max1, max2);
    }
    
    public int helper(int[] nums, int i, int j) {
        if (i == j)
            return nums[i];
        
        int[] dp = new int[nums.length];
        dp[i] = nums[i];
        dp[i + 1] = Math.max(nums[i + 1], dp[i]);
        
        for (int k = i + 2; k <= j; k++) {
            dp[k] = Math.max(dp[k - 2] + nums[k], dp[k - 1]);
        }
        
        return dp[j];
    }
}

参考资料：http://www.programcreek.com/2014/05/leetcode-house-robber-ii-java/

时间复杂度：O(n)

这道题目是House Robber问题的扩展。在这道题中一共有两种情况，第一是数组中的第一个元素
包含在结果中而最后一个元素没有包含在结果中；第二种情况是，数组中第一个元素并没有包含在
结果集中，而最后一个元素包含在结果集中。因此，我们分情况讨论，对每一种情况运用House Robeber
中的动态规划算法求得结果，最后比较这两种情况中的结果大小，较大的值则是最后的结果。





