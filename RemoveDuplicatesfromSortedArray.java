public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        
        int value = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == value)
                continue;
            else {
                value = nums[i];
                nums[index++] = nums[i];
            }
        }
        
        return index;
    }
}

参考资料：http://www.2cto.com/kf/201411/356824.html

注意：网上没有找到特别合适的，就自己写了。理清楚思路最重要，哈哈哈哈哈哈。