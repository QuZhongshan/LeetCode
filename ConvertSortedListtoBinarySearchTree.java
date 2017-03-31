/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);
        
        return helper(head, null);
    }
    
    public TreeNode helper(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == tail)
            return null;
    
        while(fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
    
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(head,slow);
        root.right = helper(slow.next,tail);
        
        return root;
    }
}

参考资料：LeetCode中的Solutions

时间复杂度：不太清楚

比较偷懒的一种做法是将list转换为数组，当然这样肯定可以解。以上的做法还不太清楚，也是用
递归做的，以后看。


