/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (guess(mid) == 0)
                return mid;
            else if (guess(mid) == 1)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return low;
    }
}

参考资料：http://www.programcreek.com/2014/07/leetcode-guess-number-higher-or-lower-java/
leetcode中Solutions答案很清楚；

时间复杂度：O(n)

很典型的二分法，题目很简单，不用多说，但是这道题还是非常有意义的，这就在一个细节上，即
mid = low + （high - low）/ 2上，虽然（low + high）/ 2与low + （high - low）/ 2
值完全一样，但是后者可以防止溢出！！！！这一点非常重要，这道题需要注意的点仅此而已，还有就是
题意问题可能有点模糊，不过这都是小问题，可以看Solutions中的解答。