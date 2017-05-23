public class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int starIndex = -1;
        int sIndex = -1;
        
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                starIndex = j;
                sIndex = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = sIndex + 1;
                sIndex++;
            } else {
                return false;    
            }
        }
        
        while (j < p.length() && p.charAt(j) == '*')
            j++;
        
        return j == p.length();
    }
}

参考资料：http://www.programcreek.com/2014/06/leetcode-wildcard-matching-java/
        https://discuss.leetcode.com/topic/3040/linear-runtime-and-constant-space-solution

时间复杂度：线性时间？不太清楚

看参考资料吧，算法总结文档里面的答案有问题


