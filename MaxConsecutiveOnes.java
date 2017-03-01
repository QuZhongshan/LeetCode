public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int maxCount = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
                maxCount = Math.max(temp, maxCount);
            } else {
                temp = 0;
            }
        }
        
        return maxCount;
    }
}

参考资料：leetcode中的Solutions

时间复杂度：O(n)

没什么好说的，纯粹打发时间。。