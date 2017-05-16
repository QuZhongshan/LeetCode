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
        
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int carry = 0;
        ListNode head = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            int sum = 0;
            if (!s1.empty())
                sum += s1.pop();
            if (!s2.empty())
                sum += s2.pop();
            sum += carry;
            
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
        }
        
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            node.next = head.next;
            head.next = node;
        }
        
        return head.next;
    }
}

参考资料：https://discuss.leetcode.com/topic/65279/easy-o-n-java-solution-using-stack

时间复杂度：O(n)



