public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
            
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3871046.html

这道题目和Remove Duplicated from storted array差不多，思路是首先定义一个变量index用于记录下一个和val值不相等
的值插入的位置，之后遍历数组，若发现一个不想的的值则将该值插入到index的位置，并将index的值加一即可。