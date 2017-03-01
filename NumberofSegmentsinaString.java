public class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        s = s.trim();
        if (s.length() == 0)
            return 0;
        
        int res = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
                res++;
        
        return res;
    }
}

参考资料：无，参考leetcode中的TopSolutions，里面的答案很好！

思路很简单，这道题目用正则表达式做最简单也最好，无奈现在我对正则表达式的掌握还不是很好，
总结的时候一定要补上。当前解法的思路是，首先去除字符串首尾的空白符，之后遍历，若当前字符
不为空，其前一个字符为空，那么就符合要求，数量加一即可。