public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        if (nums.length == 1) 
            return nums[0];
        
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] <= nums[right])
                return nums[left];
            
            int mid = (left + right) / 2;
            if (nums[mid] >= nums[left])
                left = mid + 1;
            else
                right = mid;
        }
        
        return -1;
    }
}

参考资料：http://www.programcreek.com/2014/02/leetcode-find-minimum-in-rotated-sorted-array/

怎么说呢，这道题如果按部就班的一个一个进行比较得到最小值也是可以的，其时间复杂度是O（n），
但是这道题的初衷肯定是让我们用二分查找来做，其时间复杂度是O（logn），二分查找解法的基本
思路我是明白的，及时有些细节还是不太理解，以后有时间仔细品味一下，算了，先这么着吧，啊啊啊啊。。。