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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
            
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }
    
    public TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
                            HashMap<Integer, Integer> map) {
        if (inStart > inEnd || postStart > postEnd)
            return null;
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootIndex = map.get(root.val);
        root.left = helper(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + rootIndex - inStart -1, map);
        root.right = helper(inorder, rootIndex + 1, inEnd, postorder, postStart + rootIndex - inStart, postEnd - 1, map);
        
        return root;
    }
}

参考资料：LeetCode中的Solutions

时间复杂度：O(n)
空间复杂度：O(n)

在总结里面说的还是挺清楚，直接看那里吧。


