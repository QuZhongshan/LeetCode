public class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 0 || s == null)
            return 0;
        
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count++;
            } else {
                set.add(s.charAt(i));
            }
        }
        
        if (!set.isEmpty())
            return count * 2 + 1;
        return count * 2;
    }
}

参考资料：http://blog.csdn.net/xionghuixionghui/article/details/52725911

时间复杂度：O(n)

题意就是根据一个字符串中的所有字符构建一个最长的回文串，返回这个回文串的长度；

首先说一下上面的解法思路：第一步，对所给字符串进行遍历，将每个字符放入set对象中，如果之后
发现有相同的字符，则将这个字符从set中移除，说明这个字符可以组成一对，就这样遍历整个字符串，
得到字符对的个数；第二步，判断set中是否还要剩余的字符，如果有，则可以从中取出一个放在回文串
的中间位置，这样的话回文串长度就是 对数 * 2 + 1，否则就是 对数 * 2；

还有一种用数组的解法，暂时没看，以后有时间了可以看看。。。

