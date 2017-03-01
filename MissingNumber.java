public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }
        
        return xor ^ nums.length;
    }
}

参考资料：http://blog.csdn.net/foreverling/article/details/49702187

这道题首先需要理解题意，给出一个数组，数组内需包含0到n所有的数字，其中n是数组的长度，
但是这样一来数组中肯定少一个元素，因为要求中多加了一个数字0，这样就不难理解了，数组中
肯定少一个数字。要求时间复杂度为O(n)，空间复杂度O(1)；

理解题意之后，接下来就是解法了。两种解法，一是较为简单的求和算法，就是先把所有要求数字的
和求出，在减去数组中所有的数字，余下的就是要求的结果；另一个解法就是利用异或操作符来记行
求解，重点理解java中的异或操作符之后就不难求解了。以上解法就是使用异或操作符求解。

时间复杂度：O(n);

关于异或操作符可参考：https://zhidao.baidu.com/question/321221194.html
