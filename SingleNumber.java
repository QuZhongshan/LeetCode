public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        
        for (int i = 0; i < nums.length; i++)
            res  ^= nums[i];
            
        return res;
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3870801.html
		以及leetcode的Top Solutions中的解法

LeetCode中easy类型的题目简单，这道题目是相当简单，只是考察一个亦或运算符而已，唯一需要注意
的是亦或运算的规则，哎，只可惜自己现在道行还是太浅了，想了半天，哈哈哈哈！