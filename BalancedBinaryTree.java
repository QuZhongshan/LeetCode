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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        
        if (getHeight(root) == -1)
            return false;
        
        return true;
    }
    
    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if (left == -1 || right == -1)
            return -1;
        
        if (Math.abs(left - right) > 1)
            return -1;
        
        return Math.max(left, right) + 1;
    }
}

参考资料：http://www.programcreek.com/2013/02/leetcode-balanced-binary-tree-java/
        LeetCode中的Solutions

时间复杂度：不太清楚。。。

平衡二叉树问题，典型运用递归来解决树的问题。分别判断左右两棵子树是不是平衡二叉树，如果都是并且
左右两颗子树的高度相差不超过1，那么这棵树就是平衡二叉树。



