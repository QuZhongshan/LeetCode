/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        
        int lenA = 0, lenB = 0;
        ListNode pA = headA, pB = headB;
        while (pA != null) {
            lenA++;
            pA = pA.next;
        }
        while (pB != null) {
            lenB++;
            pB = pB.next;
        }
        
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}

参考资料：http://www.tuicool.com/articles/m2Mnuev
        http://www.programcreek.com/2014/02/leetcode-intersection-of-two-linked-lists-java/

想了半天也没有什么思路，其实结题思路很简单啦，首先得到两个链表的长度，根据长度找到这两个链表的
相同长度的起点，可能以后看起来会有点晕，不过没关系，画张图就明白了，最近表达能力变得好差，还是
最近没读书所以不知道怎么表达自己了，之后就简单了，定义两个指向两个链表的指针依次向后走，如果相同
就是所求的节点，结束！希望以后看这道题的自己不要骂现在的自己写的好抽象，看不懂吧，哈哈哈！
