/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2)
            return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
            
        ListNode tail = dummy, prev = dummy;
        while (true) {
            int count = k;
            while (count > 0 && tail != null) {
                count--;
                tail = tail.next;
            } 
            if (tail == null) 
                break;
                
            head = prev.next;
            while (prev.next != tail) {
                ListNode temp = prev.next;
                prev.next = temp.next;
                temp.next = tail.next;
                tail.next = temp;
            }
                
            tail = head;
            prev = head;
        }
            
        return dummy.next;
    }
}

参考资料：https://discuss.leetcode.com/topic/5604/share-my-java-solution-with-comments-in-line

时间复杂度：不太清楚

就是k个结点k个结点的处理，看参考资料
