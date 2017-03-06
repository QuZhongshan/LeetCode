public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 1)
            return;
        
        int index = nums.length - 1;        
        while (index > 0) {
            if(nums[index - 1] < nums[index])
                break;
            index--;
        }
    
        if(index == 0) {
            reverseSort(nums, 0, nums.length - 1);
            return;
        } else {
            int val = nums[index - 1];
            int j = nums.length - 1;
            while (j >= index)  {
                if(nums[j] > val)
                    break;
                j--;
            }
        
            swap(nums, j, index-1);
            reverseSort(nums, index, nums.length - 1);
            
            return;
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverseSort(int[] nums, int start, int end) {
        if (start > end)
            return;
        for (int i = start; i <= (end + start) / 2; i++)
            swap(nums, i, start + end - i);
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3896245.html
        https://yq.aliyun.com/articles/863
        leetcode中的Solutions

时间复杂度：O(n)

题意就很难理解，解题思路虽然知道了，不过原理还是有点模糊的，参考资料很清楚，要睡午觉了，
有时间要看看清楚。。。



