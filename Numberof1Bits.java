public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        
        return count;
    }
}

参考资料：http://blog.csdn.net/canglingye/article/details/44177479

关于位管理的入门，掌握位管理的基本知识。第一种思路，先把数字n转换为二进制字符串，之后
统计字符串中的‘1’的个数就好，思路简单，但是很low；第二种思路是什么呢，先对数字n与1进行
相与操作，如果最后一位为1，那么n的最后一位就是1，否则是0，之后右移一位，接着进行与操作，
直到n为0就好。