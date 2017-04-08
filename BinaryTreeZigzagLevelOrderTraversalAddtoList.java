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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null)
            return res;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int level = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (level % 2 == 1)
                    temp.add(node.val);
                else
                    temp.add(0, node.val);
                
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            
            res.add(temp);
            level++;
        }
        
        return res;
    }
}

参考资料：LeetCode中的Solutions即可

时间复杂度：O(n)
空间复杂度：O(n)

和二叉树的层序遍历问题相似，不过有一点不同，当二叉树的层数为奇数层时，直接将节点加入到
list中即可，但是若二叉树的层数为偶数层，则在加入到list中的时候需要倒序，了解到这一点
之后就很简单了。