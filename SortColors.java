public class Solution {
    public void sortColors(int[] nums) {
        if (nums.length <= 1 || nums == null)
            return;
        
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3872313.html
        LeetCode中的Solutions

时间复杂度：O(n)

这道题目通常有两种解法，第一种很容易想到，首先遍历一遍数组，把所有颜色的个数统计出来，
之后再次遍历数组，根据各个颜色的个数对数组重新复制就好，一共需要遍历两遍；第二种方法
不太容易理解，它使用两个指针，只需遍历一遍数组就好，以上的解答就是采用的这种算法思想。
看参考资料就好，说实话想在我也不太理解。。