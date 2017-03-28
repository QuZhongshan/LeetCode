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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        
        return isSymmetricHelp(root.left, root.right);
    }
    
    public boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        
        if (!isSymmetricHelp(left.left, right.right))
            return false;
        if (!isSymmetricHelp(left.right, right.left))
            return false;
            
        return true;
    }
}

参考资料：http://www.programcreek.com/2014/03/leetcode-symmetric-tree-java/
		LeetCode中的Solutions

时间复杂度：不太清楚

这种解法是使用递归的方法。其关键是找到返回false的情况，容易理解。

解法二：迭代
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        if (root.left == null || root.right == null)
            return false;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root.left);
        stack.push(root.right);
        
        TreeNode left, right;
        while (!stack.empty()) {
            if (stack.size() % 2 != 0)
                return false;
            right = stack.pop();
            left = stack.pop();
            if (left.val != right.val)
                return false;
            
            if (left.left != null) {
                if (right.right == null)
                    return false;
                stack.push(left.left);
                stack.push(right.right);
            } else if (right.right != null) {
                return false;
            }
            
            if (left.right != null) {
                if (right.left == null)
                    return false;
                stack.push(left.right);
                stack.push(right.left);
            } else if (right.left != null) {
                return false;
            }
        }
        
        return true;
    }
}

参考资料：LeetCode中的Solutions

时间复杂度：不太清楚

这种解法是用了迭代的方法。使用一个栈，对二叉树中两两对应的节点进行比较，反正说有点说不
清楚，还是直接看代码吧。