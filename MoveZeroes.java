public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }
        
        while (insertPos < nums.length)
            nums[insertPos++] = 0;
    }
}

参考资料：https://my.oschina.net/Tsybius2014/blog/508653

借鉴了Leetcode的TopSolutions里的第一种解法，这道题很简单，解法很多，最后选择的这种解法
同时考虑了时间复杂度和空间复杂度，思路简单，找到一个非零的数值往前移，最后全部补零就好。