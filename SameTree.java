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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if  (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        
        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
        return false;
    }
}

参考资料：LeetCode中的Solutions

时间复杂度：不太清楚

同样的，一般有迭代和递归两种解法，这道题的递归解法很容易想到，以上就是，迭代以后再说吧
。。。最近都好混那做题，要改正。。。