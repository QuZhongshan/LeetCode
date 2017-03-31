解法一：递归
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        if (nums.length == 1)
            return new TreeNode(nums[0]);
        
        return helper(nums, 0, nums.length - 1);
    }
    
    public TreeNode helper(int[] nums, int low, int high) {
        if (low > high)
            return null;
        
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, low, mid - 1);
        root.right = helper(nums, mid + 1, high);
        
        return root;
    }
}

参考资料：LeetCode中的Solutions
		http://www.programcreek.com/2013/01/leetcode-convert-sorted-array-to-binary-search-tree-java/

时间复杂度：不太清楚

典型的深度优先遍历算法DFS。这里是用了递归的方法，其实和自己想的差不多，就是对于递归的思想
说实话还是不太理解，这个假期总结树，顺带总结递归和迭代。

解法二：迭代

直接看LeetCode中的Solutions吧，懒得写了。



