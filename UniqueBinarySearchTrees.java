public class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        
        return dp[n];
    }
}

参考资料：http://blog.csdn.net/linhuanmars/article/details/24761459
        leetcode中的Solutions

时间复杂度：O(n^2)

也是典型的动态规划问题，对现在的我来说有点难理解，这个礼拜一定要总结一下。。。