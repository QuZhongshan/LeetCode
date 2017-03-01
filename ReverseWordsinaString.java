public class Solution {
    public String reverseWords(String s) {
        if (s == null)
            return s;
        
        String[] words = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i > 0; i--) {
            res.append(words[i]);
            res.append(" ");
        }
        
        res.append(words[0]);
        return res.toString();
    }
}

参考资料：http://www.programcreek.com/2014/02/leetcode-reverse-words-in-a-string-java/
重点看leetcode中的TopSolutions中的解法。

这道题就两种思路，一种是字符串全部翻转，在翻转每个单词，最后除去多余的空格；另一种就是
先处理字符串，除去多余的空格，之后转换为单词数组，最后构建一个新的字符串就好了，这里
我选用了第二种，哎，还是不会正则表达式，要不然早做出来了，还是naive。。。。