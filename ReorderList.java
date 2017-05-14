/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        
        // find the middle of the list
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse the seconde half list
        ListNode middle = slow;
        ListNode preCurrent = middle.next;
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = middle.next;
            middle.next = current;
        }
        
        // start reorder one by one
        ListNode l1 = head, l2 = middle.next;
        while (l1 != middle) {
            middle.next = l2.next;
            l2.next = l1.next;
            l1.next = l2;
            l1 = l2.next;
            l2 = middle.next;
        }
        
        return;
    }
}

参考资料：https://discuss.leetcode.com/topic/13869/java-solution-with-3-steps/2

时间复杂度：O(n)

这道题目思路稍微有点复杂，主要分为三步。一，找到中间结点并将这个链表分为两部分；第二，将
后半部分链表翻转；第三，将两个链表合并。这其中包括的方法有如何找链表中间结点、链表翻转、
合并链表，比较复杂但思路简单。链表要好好总结。





