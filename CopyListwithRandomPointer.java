/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode cur = dummy;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        while (head != null) {
            RandomListNode newNode = new RandomListNode(head.label);
            cur.next = newNode;
            map.put(head, newNode);
            newNode.random = head.random;
            head = head.next;
            cur = cur.next;
        }
        
        cur = dummy.next;
        while (cur != null) {
            if (cur.random != null) {
                cur.random = map.get(cur.random);
            }
            
            cur = cur.next;
        }
        
        return dummy.next;
    }
}

参考资料：算法总结资料，很详细

时间复杂度：不太清楚

没什么可说的，直接看参考资料。。。。



