/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode newHead = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = newHead;
            newHead = head;
            head = nextNode;
        }
        
        return newHead;
    }
}

参考资料：http://www.programcreek.com/2014/05/leetcode-reverse-linked-list-java/
重点参考leetcode中TopSolutions中的第一个java解答

这道题有可以用两种方法来解答，即迭代和递归，重点掌握迭代解法。迭代的思想就是一个节点一个
节点来进行处理，首先创建一个尾节点，为null，之后处理每一个节点，主要包括两个步骤，第一步，
得到该节点，将该节点的后续节点设置为尾节点；第二步，将尾节点引用指向刚刚处理的节点。

递归解法暂时没有思考，之后再说吧，假期里不容易是吧哈哈哈哈。。。。