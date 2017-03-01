public class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        
        while (n > len * count) {
             n -= len * count;
             len += 1;
             count *= 10;
             start *= 10;
        }
        
        start += (n - 1) / len;
        String s = String.valueOf(start);
        
        return s.charAt((n - 1) % len) - '0';
    }
}

参考资料：http://www.programcreek.com/2014/09/leetcode-nth-digit-java/
        http://blog.csdn.net/qq508618087/article/details/52582162
        leetcode中的Solutions；

时间复杂度：不太清楚。。。

纯粹的数学问题，啊啊，是这样的，有1个数字的数一共有9个，有2个数字的数一共有90个，有
3个数字的数一共有900个。。。根据这个规律进行计算就好，看参考资料，今天实在没心情了
啊啊啊，大周末的我累了。。
