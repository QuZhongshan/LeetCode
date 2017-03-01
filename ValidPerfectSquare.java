解法一：（二分法）
public class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1, high = num;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid < num) {
                low = mid + 1;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        
        return false;
    }
}

时间复杂度：O(logn)

思路就不说了，二分法不都一样，记两点不理解的地方：一、变量mid类型为什么是long而不是
int；二、变量mid的计算方法为什么是low + (high - low) / 2而不是(low + high) / 2;

解法二：（完全平方数）
public class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        
        return num == 0;
    }
}

时间复杂度：O(sqrt(n))

这是基于完全平方数特性的解法，完全平方数是一系列奇数之和，即1+3+5+...，所以这道题目就
转换为查看num是不是一系列奇数之和的问题，就是上面的解法；

解法三：（牛顿法）
不看了，以后有时间看leetcode中的Solutions；

时间复杂度：接近O(1)

解法四：（暴力解法）
没什么好说的，从1到num逐个试一下，可以适当的缩小范围，例如除1之外，num只能是1到num/2的
平方等等，这样就是缩小了一般的范围，当然还可以继续缩小范围，但时间复杂度高，不如二分法和
完全平方数法好；

时间复杂度：O(n)

参考资料：http://www.cnblogs.com/guoguolan/p/5619443.html



