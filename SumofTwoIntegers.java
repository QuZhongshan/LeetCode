public class Solution {
    public int getSum(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        
        return a;
    }
}

参考资料：http://bookshadow.com/weblog/2016/06/30/leetcode-sum-of-two-integers/
重点参考leetcode中的Solutions中的答案，其中有关于位管理的总结，非常的详细！！

时间复杂度：不太清楚！！！！

思路就是通过位操作异或与与操作来进行加法操作；首先通过与操作来换取进位，之后进行异或操作
将没有进位的位置直接加到a中即可，随后将进位左移一位，继续与a进行异或与与操作直到进位为0
为止。。。。


