public class Solution {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        
        return num ^ mask;
    }
}

参考资料：http://blog.csdn.net/styshoo/article/details/54743057
重点参照leetcode中Solutions，里面讲解的非常清楚！

时间复杂度：O(1)

简单来说就是求补数的问题，属于位管理的范畴；怎么说的，比若说5，其二进制表示形式为
“101”，要求出它的补数，只需要让其与“111”进行异或操作就好，所以这个问题就转变为
了如何求出num的掩码问题，于是就有了以上的解法，Java中的内置方法真的很方便，可以利用
这些方法很方便的求出他的掩码，就这样吧，具体的看代码就清楚了，实在忘了就去看看参考资料。。