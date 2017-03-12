/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        k = k % len;
        if (k == 0)
            return head;
        
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; i++)
            fast = fast.next;
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        
        return newHead;
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3864411.html

时间复杂度：O(n)

很典型的一道链表问题，不说了，参考资料很清楚，毕竟是一遍AC的题目就不多说了。。。


