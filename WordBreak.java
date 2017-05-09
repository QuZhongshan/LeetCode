public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] =  true;
        
        for (int i = 1; i <= s.length (); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[s.length()];
    }
}

参考资料：https://discuss.leetcode.com/topic/6156/java-implementation-using-dp-in-two-ways

时间复杂度：不太清楚。。。

使用动态规划的算法来解。

（1）递推量：dp[i]，表示 0 - (i - 1) 的子串可以被分割；
（2）推导递推式：直接看以上代码比较清楚。。
（3）初始值：设一个 dp[0] =  true

这是一道使用动态规划来求解的问题