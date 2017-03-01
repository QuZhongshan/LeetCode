public class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() == 0)
            return s;
            
        char[] ch = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            char tmp = ch[end];
            ch[end] = ch[start];
            ch[start] = tmp;
            start++;
            end--;
        }
        
        return String.valueOf(ch);
    }
}

参考资料：leetcode中的Solutions解答的很清楚；

不多说了，这种题目不需要说太多，就是首尾替换就行；

时间复杂度：O(n)

