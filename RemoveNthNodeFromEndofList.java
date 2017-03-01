/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
            
        ListNode fast = head;
        ListNode slow = head;
        
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        
        if (fast == null) {
            head = head.next;
            return head;
        }
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return head;
    }
}

参考资料：http://www.programcreek.com/2014/05/leetcode-remove-nth-node-from-end-of-list-java/
        http://www.2cto.com/kf/201310/251457.html