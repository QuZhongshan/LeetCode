/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode firstHalf = head;
        ListNode secondHalf = slow.next;
        slow.next = null;
        
        ListNode l1 = sortList(firstHalf);
        ListNode l2 = sortList(secondHalf);
        
        return merge(l1, l2);
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode p = l;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            
            p = p.next;
        }
        
        if (l1 != null)
            p.next = l1;
        if (l2 != null)
            p.next = l2;
        
        return l.next;
    }
}

参考资料：https://discuss.leetcode.com/topic/18100/java-merge-sort-solution
        http://www.cnblogs.com/springfor/p/3869372.html

时间复杂度：O(nlogn)

这道题目要求时间复杂度为O(nlogn)，空间复杂度为O(1)。用归并排序，首先将整个链表分为两个
部分，在这里使用快慢指针来进行划分，之后递归调用这个方法来对这两部分分别排序，最后调用归并
排序方法对这两个链表进行整合排序即可。






