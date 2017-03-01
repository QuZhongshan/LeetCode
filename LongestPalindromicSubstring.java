public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2)
            return s;
        
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String tmp = helper(s, i, i);
            if (tmp.length() > res.length())
                res = tmp;
            
            tmp = helper(s, i, i + 1);
            if (tmp.length() > res.length())
                res = tmp;
        }
        
        return res;
    }
    
    public String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        
        return s.substring(begin + 1, end);
    }
}

参考资料：http://www.programcreek.com/2013/12/leetcode-solution-of-longest-palindromic-substring-java/
        http://blog.csdn.net/linhuanmars/article/details/20888595

时间复杂度：O(n^2)

这是一道经典题目，要好好总结。这道题目一般有两种解法，一种是动态规划算法，另一种是通常的
算法；因为动态规划暂时还没有总结，所以这里先分析一下普通算法。

基本思路是对于每个子串的中心（可以是一个字符，或者是两个字符的间隙，比如串abc,中心可以
是a，b，c，或者是ab的间隙，bc的间隙）往两边同时进行扫描，直到不是回文串为止。假设字符
串的长度为n，那么中心的个数为2 * n - 1(字符作为中心有n个，间隙有n-1个）。对于每个中
心往两边扫描的复杂度为O(n)，所以时间复杂度为O((2*n-1)*n)=O(n^2)，空间复杂度为O(1)。

动态规划算法以后总结了在回过头来看看，不知道什么时候哎。。。。






