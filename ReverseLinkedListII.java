/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n)
            return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i < m - 1; i++)
            pre = pre.next;
        
        ListNode start = pre.next;
        ListNode then = start.next;
        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
        return dummy.next;
    }
}

参考资料：LeetCode中的Solutions
        http://blog.csdn.net/linhuanmars/article/details/24613781

时间复杂度：O(n)
空间复杂度：O(1)

链表的问题，首先要理解题意，这道题目的意思是m与n之间所有节点 都要倒转，并不仅仅是m节点
与n节点。之后考虑这道题，思路不是特别复杂，就是一个节点一个节点的处理，每个节点移动到
m节点开始的位置，这样知道n节点就好。思路简单，但是代码不好写，解法中的倒转这一部分代码
看了好久。。现在总算是有点理解了，不过之后肯定还会忘记的，到时候一定要画图自己在推一遍。
今天好烦。。。不过最近一阵子都挺烦的。。





