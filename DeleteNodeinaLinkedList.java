/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null)
            return;
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

参考资料：直接看leetcode中的TopSolutions就好了，怎么说呢，这是一个stupid question，非常
跟你说。

思路很简单，吧当前节点的值改为后继节点的值，当前节点的next引用指向后继节点的next引用，是不是非常
非常蠢！这种问题怎么会存在，可惜我不看答案根本想不到，哈哈哈哈，我也好蠢啊！！！