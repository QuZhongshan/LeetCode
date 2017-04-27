public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int[] maxDp = new int[nums.length];
        int[] minDp = new int[nums.length];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        int max = maxDp[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                maxDp[i] = Math.max(nums[i], maxDp[i - 1] * nums[i]);
                minDp[i] = Math.min(nums[i], minDp[i - 1] * nums[i]);
            } else {
                maxDp[i] = Math.max(nums[i], minDp[i - 1] * nums[i]);
                minDp[i] = Math.min(nums[i], maxDp[i - 1] * nums[i]);
            }
            
            max = Math.max(maxDp[i], max);
        }
        
        return max;
    }
}

参考资料：http://www.programcreek.com/2014/03/leetcode-maximum-product-subarray-java/

时间复杂度：O（n）

具体看算法总结，动态规划典型题目。