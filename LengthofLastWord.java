public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        s = s.trim();
        if (s.length() == 0)
            return 0;
        
        int i = s.lastIndexOf(' ');
        if (i == -1)
            return s.length();
        else
            return s.length() - i - 1;
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3872326.html
        https://segmentfault.com/a/1190000003871916

这道题目很简单，参考资料里传统较为繁琐的，投机取巧利用java api的解法都有，不过我还是坚持了
自己的写法，思路简单写一下：首先将字符串首尾的空白字符出去，之后根据' '字符找到最后一个单词
的开始位置，最后计算这个单词的长度就好喽！一般般啦....