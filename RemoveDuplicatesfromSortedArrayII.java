public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length < 3)
            return nums.length;
        
        int index = 0;
        for (int num : nums)
            if (index < 2 || num > nums[index - 2])
                nums[index++] = num;
        
        return index;
    }
}

参考资料：LeetCode中的Solutions
        http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-ii-java/

时间复杂度度：O(n)

自己做的思路可以ac，参考资料中网址所给的答案就是常规的解题思路，自己也是这种思路可以AC。
难点在于Solutions中的答案，有点难理解，模模糊糊的可以理解，就先这样吧。。。        