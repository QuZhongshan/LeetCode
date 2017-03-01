解法一：（递归）
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        
        if (n >= 2 && n % 2 == 0)
            return isPowerOfTwo(n / 2);
        return false;
    }
}
以上是递归算法，算法主要思想是如果n是2的幂，那么n肯定可以被2整除并且商肯定也是2的幂；
时间复杂度：O(logn)

解法二：（迭代）
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        
        while (n % 2 == 0)
            n = n / 2;
        
        return n == 1;
    }
}
以上是迭代算法，算法主要思想就是将n一直除2，若n是2的幂，那么n最后肯定会得到1，否则n就
不是2的幂；
时间复杂度：O(logn)

解法三：（位操作）
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        
        return (n & (n - 1)) == 0;
    }
}
位操作总共有两种解法，这是第一种解法；其算法思想是如果n是2的幂，那么其二进制表示中只有
最高位为1，其余均为0，那么n & （n - 1） == 0，依据这个性质可以进行判断；
时间复杂度：O(1)

解法四：（位操作）
第二种位操作解法的算法思想是这样的，如果n为2的幂，那么其二进制表示形式中只有一个1，这就
回归到了计数n中1的个数的问题，这里不再详述，可以看计数1的问题。

参考资料：http://blog.csdn.net/chenchaofuck1/article/details/51226899
还有leetcode中的Discussion，其中还有一种数学解法，这里暂不考虑，我毕竟不是做数学的。
