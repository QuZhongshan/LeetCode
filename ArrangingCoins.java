public class Solution {
    public int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        int mid = 0;
        
        while (start <= end) {
            mid = (start + end) >>> 1;
            
            if ((0.5 * mid * mid + 0.5 * mid ) <= n){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        return start - 1;
    }
}

参考资料：leetcode中的Solutions

时间复杂度：O(logn)

用二分法，不理解。。。最近状态太差了。。。
