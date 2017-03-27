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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            
            result.add(0, temp);
        }
        
        return result;
    }
}

参考资料：LeetCode中的Solutions

时间复杂度：不太清楚

和Binary Tree Level Order Traversal解法完全一样，只不过最后把结果集倒转一下就好。






