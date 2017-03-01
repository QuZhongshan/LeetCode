public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        
        if (sum % 2 != 0)
            return false;
        
        int half = sum / 2;
        boolean[] dp = new boolean[half + 1];
        dp[0] = true;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = half; j >= nums[i-1]; j--) {
                dp[j] = dp[j] || dp[j - nums[i-1]];
            }
        }
        return dp[half];
    }
}

参考资料：http://www.cnblogs.com/grandyang/p/5951422.html

时间复杂度：暂时不太清楚。。

一道动态规划的问题。前面没有什么可说的，首先求出整个数组的所有元素之和，然后看它是否为
偶数，若为奇数那么肯定不存在，直接返回false就好；接下来才是重点，得到总和的一半，之后
这道题就转化为了求出这个数组中是否存在一个集合，使其中所有的值之和正好等于总和的一半，
接下来就是运用动态规划来解题了。。很遗憾动态规划我还没有弄懂，这个周末一定要总结动态规划
。。flag已经立了啊