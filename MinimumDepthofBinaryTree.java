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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        if (left == 0 || right == 0)
            return left + right + 1;
        else
            return Math.min(left, right) + 1;
    }
}

参考资料：LeetCode中的Solutions
        http://www.programcreek.com/2013/02/leetcode-minimum-depth-of-binary-tree-java/

时间复杂度：不太清楚。。。。。

参考资料是两种不同的解法，一种是递归，另一种是迭代，暂时都不太清楚。。。。最近状态好差，
但愿一切都好。。我回来还愿的！        

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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int level = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();
                
                if (temp.left == null && temp.right == null)
                    return level;
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
            
            level++;
        }
        
        return level;
    }
}

参考资料：https://discuss.leetcode.com/topic/31286/easy-solution-using-bfs-in-java

时间复杂度：不太清楚。。。。。

这种解法采用层序遍历，只不过在检测到第一个叶子结点时直接返回层数即可。


        