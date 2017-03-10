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
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<TreeNode>();
        }
 
        return helper(1, n);
    }
    
    public List<TreeNode> helper(int m, int n){
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(m > n){
            result.add(null);
            return result;
        }
 
        for(int i = m; i <= n; i++) {
            List<TreeNode> ls = helper(m, i-1);
            List<TreeNode> rs = helper(i+1, n);
            for (TreeNode l : ls) {
                for (TreeNode r : rs) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    result.add(curr);
                }
            }
        }
 
        return result;
    }
}

参考资料：http://www.programcreek.com/2014/05/leetcode-unique-binary-search-trees-ii-java/

时间复杂度：不太清楚

这道题目是Unique Binary Srarch Tree的扩展，不过不同的是这道题目求解的是具体的树结构，
而不是BST的数量。这周末总结。。。动态规划不好理解啊啊啊啊啊。。



