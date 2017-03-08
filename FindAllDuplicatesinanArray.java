public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0)
            return res;
        
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            
            if (nums[val - 1] > 0)
                nums[val - 1] = -nums[val - 1];
            else
                res.add(val);
        }
        
        return res;
    }
}

参考资料：http://www.cnblogs.com/Dylan-Java-NYC/p/6241994.html
        leetcode中的Solutions

时间复杂度：O(n)

类似Find All Numbers Disappeared in an Array 这道题目，使用负值来标记这个数字是否
出现过，代码很清楚，说明这段时间以来还是有点效果的，哈哈