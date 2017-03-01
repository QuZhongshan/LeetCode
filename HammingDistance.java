public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}

参考资料：leetcode中的Solutions

时间复杂度：不太清楚

思路很简单，先异或操作，之后统计结果中1的个数，这个可以自己写，也可以直接使用Integer类
中的相关方法，如上所示，没什么好说的。。