/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast)
                return true;
        }
        
        return false;
    }
}

参考资料：http://blog.csdn.net/styshoo/article/details/48186061
        http://www.bubuko.com/infodetail-270933.html

判断一个链表是否有环是一个很典型的问题，一定要踏实掌握，思路很简单，利用快慢指针来进行求解，
开始时两个指针都指向头结点，之后，慢指针每次移动一个位置，快指针每次移动两个位置，若存在环，
则快指针肯定会追上慢指针，否则，快指针总会指向一个null值。思路就是这样，基础不踏实啊。