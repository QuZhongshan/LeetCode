/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);
        ListNode curr1 = dummy1, curr2 = dummy2;
        while (head != null) {
            if (head.val < x) {
                curr1.next = head;
                curr1 = head;
            } else {
                curr2.next = head;
                curr2 = head;
            }
        
            head = head.next;
        }
        curr2.next = null;
        curr1.next = dummy2.next;
    
        return dummy1.next;
    }
}

参考资料：LeetCode中的Solutions
        http://www.programcreek.com/2013/02/leetcode-partition-list-java/

时间复杂度：O(n)

本来以为会有什么巧妙的解法，结果想多了。。思路很简单，将比x值小的节点重新从存放到一个
链表里，将其他的节点放到另一个链表里，之后链接两个链表就好。需要注意的是最后一定要将
结果链表的最后一个节点的next值设置为null，否则检测不到最后的节点，会TLE报错。。我刚
开始就是犯了这个错误。。。








