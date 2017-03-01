public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        
        return 1162261467 % n == 0;
    }
}

参考资料：http://blog.csdn.net/yeshiwu/article/details/51673322
重点看leetcode中的Discussion；

纯粹的数学算法问题，和PowerOfTwo问题不同，这道题目要求不使用循环和递归，位管理也
没有规律可循，故只能从数学层面入手；第一种是3的幂在java的int范围内是有限的，所以可以
列举出所有的3的幂，其中最大的值是1162261467，所有的3的幂都能被它整除，以上算法就
是基于这个思想；第二种是使用log进行求解，之后再看吧。。
