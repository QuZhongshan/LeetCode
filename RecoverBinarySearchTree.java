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
    public void recoverTree(TreeNode root) {
        if(root == null)  
            return;  
        
        ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
        pre.add(null);
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        helper(root, pre, res);
        
        if (res.size() > 0) {
            int temp = res.get(0).val;  
            res.get(0).val = res.get(1).val;  
            res.get(1).val = temp;  
        }
    }
    
    public void helper(TreeNode root, ArrayList<TreeNode> pre, ArrayList<TreeNode> res) {
        if (root == null)
            return;
        
        helper(root.left, pre, res);
        if (pre.get(0) != null && pre.get(0).val > root.val) {  
            if (res.size() == 0) {  
                res.add(pre.get(0));  
                res.add(root);  
            } else {  
                res.set(1, root);
            }
        }
        pre.set(0, root);
        helper(root.right, pre, res);
    }
}

参考资料：http://blog.csdn.net/linhuanmars/article/details/24566995

时间复杂度：O(n)
空间复杂度：O(logn)

这道题目对于我来说还很男，具体总结在算法里面了，看那个吧。


