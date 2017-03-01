public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0)
            return false;
        
        return ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}

参考资料：http://blog.csdn.net/happyaaaaaaaaaaa/article/details/51218261
重点参考leetcode中的Solutions；

老思路，递归、迭代和位管理；递归和迭代是基本思路，务必掌握，忘了可以参考Power of Two
题目的解法，刚才试了一下现在还记得；

至于位管理的话就需要掌握点技巧了，4的幂有两个条件，一是它的二进制形式1的个数只有一个，二
是这个一必须在奇数位上，比如1、3、5。。。；以上解法就是这个思路的具体实现。其中num & （num - 1）
是判断这个数是不是2的幂，num & 0x55555555判断这个数字二进制形式的1的位置是不是在奇数位置
上；

时间复杂度：O(1)
