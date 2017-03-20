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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean helper(TreeNode root, long minVal, long maxVal) {
        if (root == null)
            return true;
        if (root.val >= maxVal || root.val <= minVal)
            return false;
        
        return helper(root.left, minVal, root.val) && helper(root.right, root.val, maxVal);
    }
}

参考资料：LeetCode中的Solutions
        http://www.programcreek.com/2012/12/leetcode-validate-binary-search-tree-java/

时间复杂度：O(n)

树的相关问题基本都有递归和迭代两种解法，这道题目也不例外。上面的解法是递归算法，思路还容易
理解，要说不理解的就是递归的思想了。。。要总结递归和迭代了。。        