public class Solution {
    public double myPow(double x, int n) {
        if(n == 0) 
            return 1;
    
        if(n < 0) {
            if(n == Integer.MIN_VALUE) {
                ++n;
                n = -n;
                x = 1 / x;
                
                return x * x * myPow(x * x, n / 2);
            }
            
            n = -n;
            x = 1 / x;
        }
    
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}

参考资料：https://discuss.leetcode.com/topic/5425/short-and-easy-to-understand-solution/10

时间复杂度：O(logn)

思路很简单，用brute force也可以解，只不过时间超时了，所以改用递归的方法来解。要注意
leetcode中的解法已经很老了，不能AC，注意看参考资料下面的讨论内容，其中的点就是要注意
n值下溢的问题。