public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums == null || nums.length < 2 || k <= 0)
            return;
        
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    
    private void reverse(int[] nums, int left, int right) {
        int tmp = 0;
        while (left < right) {
            tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}

参考资料：http://www.programcreek.com/2015/03/rotate-array-in-java/

这里总结一下我自己以前的思路和网上常规答案的思路：
我自己的思路是首先创建一个临时数组，存储翻转成功之后的数组，之后根据临时数组更改目标数组，首先
将目标数组后k位的值存储在临时数组中，然后顺序存储目标数组剩余的值，最后依据这个临时数组更改目标
数组就好。
网上的常规答案是首先翻转数组后k位的值，之后翻转数组前n-k位的值，最后翻转整个数组的值就好，空间
复杂度O（1），时间复杂度O（n），挺简单的，谨记！