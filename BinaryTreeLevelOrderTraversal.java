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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < levelSize; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
            }
            
            result.add(temp);
        }
        
        return result;
    }
}

参考资料：LeetCode中的Solutions
        http://www.cnblogs.com/tonyluis/p/4523689.html

时间复杂度：不太清楚

二叉树的层次遍历，使用一个队列来进行处理。想了半天，不知道怎么说思路，就直接看代码吧。




