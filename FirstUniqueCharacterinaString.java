public class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return -1;
        
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++)
            alphabet[s.charAt(i) - 'a']++;
        
        for (int i = 0; i < s.length(); i++)
            if (alphabet[s.charAt(i) - 'a'] == 1)
                return i;
        
        return -1;
    }
}

参考资料：http://www.cnblogs.com/zihaowang/p/5801369.html

不难，经过几十道题的磨练总算有点效果了，知道开一个存储所有字母数量的数组了，还是有进步
的，这道题的思路很简单，看参考资料和leetcode中的TopSolutions就好了。