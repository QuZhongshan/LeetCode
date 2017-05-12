/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            while (pre.next != null && pre.next.val < cur.val)
                pre = pre.next;
            
            cur.next = pre.next;
            pre.next = cur;
            pre = dummy;
            cur = next;
        }
        
        return dummy.next;
    }
}

参考资料：https://discuss.leetcode.com/topic/8570/an-easy-and-clear-way-to-sort-o-1-space/2

时间复杂度：不太清楚。。。

思路很简单，就是根据插入排序的思想就像排序即可，不过在实现上确实需要技巧。。wtf，受不了了




