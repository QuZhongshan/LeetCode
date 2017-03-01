/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode odd = head;
        ListNode evenHead = head.next, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        
        return head;
    }
}

参考资料：http://www.programcreek.com/2015/03/leetcode-odd-even-linked-list-java/
重点还是参考leetcode中的Solutions，以上的参考资料只是看看就行；

思路其实很简单，和自己想的思路一样，把整个链表分解为偶数节点子链表和奇数节点子链表，之后
将奇数节点子链表的尾节点的后继节点设置为偶数节点子链表的头节点即可；在代码层面上是一个节点
一个节点的逐个处理；虽然想得到，但是在代码具体实现上还是把握不好，要多实践。。

时间复杂度：O(n)
空间复杂度：O(1)


