public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0)
            return true;
        if (t == null || t.length() == 0)
            return false;
        
        int sIndex = 0, tIndex = 0;
        while (tIndex < t.length()) {
            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++;
                if (sIndex == s.length())
                    return true;
            }
            tIndex++;
        }
        
        return false;
    }
}

参考资料：http://www.cnblogs.com/dongling/p/5843697.html

时间复杂度：O(n)

这道题目其实挺简单的，就是用两个指针来做就好，具体可以看参考资料，就不细说了，看代码
也能懂，还有，今天的事还真多，乱七八糟。。。。。