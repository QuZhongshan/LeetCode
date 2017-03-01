/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == pre.val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        
        return head;
    }
}

参考资料：http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-list/

一个节点一个节点的判断，如果和前一个节点的值相等，则跳过这个节点，知道找到和前一个节点值不同的
节点为止，之后一次类推，知道链表结束。