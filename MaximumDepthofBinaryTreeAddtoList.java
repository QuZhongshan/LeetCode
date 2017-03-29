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
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

参考资料：LeetCode中的Solutions
		http://blog.csdn.net/linhuanmars/article/details/19659525

时间复杂度：不太清楚

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
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	    stack.push(root);
	    int count = 0;
	    while (!stack.isEmpty()) {
		    int size = stack.size();
		    while (size-- > 0) {
			    TreeNode cur = stack.pop();
			    if (cur.left != null)
				    stack.addLast(cur.left);
			    if (cur.right != null)
				    stack.addLast(cur.right);
		    }
		    count++;
	    }
	    
	    return count;
    }
}

参考资料：LeetCode中的Solutions
		http://blog.csdn.net/linhuanmars/article/details/19659525

时间复杂度：不太清楚

这里用到了二叉树的层次遍历，只不过是增加了一步统计层数的步骤而已。



