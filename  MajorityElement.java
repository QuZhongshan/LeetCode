public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

参考资料：http://www.programcreek.com/2014/02/leetcode-majority-element-java/

没什么好说的这道题，首先排序，时间复杂度O（nlogn），之后直接返回排好序数组的中间元素即可。