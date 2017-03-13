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
        
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val)
                cur = cur.next;
            if (pre.next == cur) {
                pre = cur;
            } else {
                pre.next = cur.next;
            }
            
            cur = cur.next;
        }
        
        return fakeHead.next;
    }
}

参考资料：http://www.programcreek.com/2014/06/leetcode-remove-duplicates-from-sorted-list-ii-java/
        LeetCode中的Solutions

时间复杂度：不太清楚。。。

链表问题，难点在于将重复的元素一个不留直接删除，这就需要设置一个辅助头结点来进行操作。
思路比较难以整理清楚，总体思路就是找到一个不是重复的节点，之后将指针指向这个节点，随后
继续向后查找。重点看LeetCode中的Solutions，在画图模拟一下，不知道怎么说，反正就是很
乱。。。






