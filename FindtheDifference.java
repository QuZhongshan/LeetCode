public class Solution {
    public char findTheDifference(String s, String t) {
        int[] letters = new int[26];
        for (char c : s.toCharArray())
            letters[c - 'a']++;
        
        for (char c : t.toCharArray())
            if (--letters[c - 'a'] < 0)
                return c;
        
        return 0;
    }
}

参考资料：http://blog.csdn.net/micky_kiko/article/details/52448617

思路简单，解法很多，可以用数组，可以用bit，看leetcode中的TopSolutions和参考资料就好。