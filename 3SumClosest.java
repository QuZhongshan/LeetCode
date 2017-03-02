public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3)
            return 0;
        
        int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        
        return result;
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3860175.html
        leetcode中的Solutions

时间复杂度：O(n^2)

这道题目是3Sum问题的变体，和3sum问题很像而且比他简单，在这道题目中不需要考虑元素重复的
问题，所以思路更加简单，也更容易理解，就这样吧。






