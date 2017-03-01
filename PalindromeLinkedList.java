/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;
        
        ListNode p1 = secondHead;
        ListNode p2 = p1.next;
        while (p1 != null && p2 != null) {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        secondHead.next = null;
        
        ListNode p = (p2 == null ? p1 : p2);
        ListNode q = head;
        while(p != null) {
            if(p.val != q.val)
                return false;
 
            p = p.next;
            q = q.next;
        }

        return true;
    }
}

参考资料：http://www.programcreek.com/2014/07/leetcode-palindrome-linked-list-java/

回文链问题，有点难度。

思路很简单，首先找到链表的中间节点，之后将链表分为两部分，最后对这两部分进行比较。具体实现看
参考资料，现在的我还不是很懂。哈哈哈哈哈哈哈哈




