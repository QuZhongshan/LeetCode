/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return null;
        
        int carry =0;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
 
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
 
            p3.next = new ListNode(carry % 10);
            p3 = p3.next;
            carry /= 10;
        }
 
        if (carry == 1) 
            p3.next = new ListNode(1);
 
        return newHead.next;
        
    }
}

参考资料：http://www.programcreek.com/2012/12/add-two-numbers/

时间复杂度：O(n)

看算法总结

