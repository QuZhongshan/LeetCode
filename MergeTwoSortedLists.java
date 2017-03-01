/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return l1 == null ? l2 : l1;
            
        ListNode p1 = l1, p2 = l2;
        ListNode head, temp;
        if (p1.val < p2.val) {
            head = p1;
            temp = head;
            p1 = p1.next;
        } else {
            head = p2;
            temp = head;
            p2 = p2.next;
        }
        
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
            } else {
                temp.next = p2;
                temp = temp.next;
                p2 = p2.next;
            }
        }
        
        if (p1 != null)
            temp.next = p1;
        if (p2 != null)
            temp.next = p2;
        
        return head;
    }
}

参考资料：http://www.2cto.com/kf/201505/401648.html
        http://www.cnblogs.com/codingmylife/archive/2012/09/27/2705286.html
        http://blog.csdn.net/a15994269853/article/details/17005765




