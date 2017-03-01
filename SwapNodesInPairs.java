/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        // 处理头结点
        ListNode p = head.next;
        head.next = p.next;
        p.next = head;
        head = p;
        
        ListNode ptr1 = head.next;
        ListNode ptr2 = head.next.next;
        while (ptr2 != null && ptr2.next != null) {
            ListNode temp = ptr2.next;
            ptr2.next = temp.next;
            temp.next = ptr2;
            ptr1.next = temp;
            ptr1 = ptr2;
            ptr2 = ptr2.next;
        }
        
        return head;
    }
}

参考资料：http://blog.csdn.net/a15994269853/article/details/20701271
        http://www.cnblogs.com/springfor/p/3862030.html

注：网上暂时没有找到较清晰的解法，所以就自己整理了一下喽，这道题目思路还是挺简单的，就是代码写起来比较绕。