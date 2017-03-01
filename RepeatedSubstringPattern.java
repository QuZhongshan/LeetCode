public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        
        boolean res = false;
        for (int i = 1; i <= len / 2; i++) {
            StringBuilder tmp = new StringBuilder();
            String subStr = str.substring(0, i);
            int subLen = i - 0;
            
            if (len % subLen != 0)
                continue;
            
            int n = len / subLen;
            for (int j = 0; j < n; j++)
                tmp.append(subStr);
            if (tmp.toString().equals(str)) {
                res = true;
                break;
            }
        }
        
        return res;
    }
}

参考资料：http://blog.csdn.net/MebiuW/article/details/53193043
注意leetcode中的TopSolutions。

怎么说呢，暴力解法，一次一次的实验，看参考答案也是这个思路，不过有几个好像用的是其他算法，
先不管了，就先这样吧，代码我是一点都没改，完全自己写的，还行吧，虽然效率低，但起码AC了是吧。