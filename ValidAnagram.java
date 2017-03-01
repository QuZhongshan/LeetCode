public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++)
            alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            alphabet[t.charAt(i) - 'a']--;
            
        for (int i : alphabet)
            if (i != 0)
                return false;
        
        return true;
    }
}

参考资料：http://blog.csdn.net/zuoyexingchennn/article/details/47303557

题目简单，你要理解题目的意思，所谓的anagram就是说这两个字符串的字母数量和类型都相同只是排列
顺序不同，首先想到的是用map来做，但是Collection掌握的不是很好，所以有点麻烦，最后看了答案直接
用数组做就好，除了上面的参考资料，也要看看leetcode本身TopSolutions中的答案，很好！！