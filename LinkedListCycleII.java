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
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (fast == slow) {
                ListNode slow2 = head;
                while (slow2 != slow) {
                    slow2 = slow2.next;
                    slow = slow.next;
                }
                
                return slow;
            }
        }
        
        return null;
    }
}

参考资料：https://discuss.leetcode.com/topic/19367/java-o-1-space-solution-with-detailed-explanation/2
        https://segmentfault.com/a/1190000006013225

时间复杂度：不太清楚

具体看参考资料，基础题。。。。



