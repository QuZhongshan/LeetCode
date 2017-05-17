/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override    
            public int compare(ListNode n1, ListNode n2) {
                return n1.val - n2.val;    
            }
        });
        
        for (ListNode list : lists) {
            if (list != null)
                queue.offer(list);
        }
        
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (!queue.isEmpty()) {
            ListNode n = queue.poll();
            p.next = n;
            p = p.next;
            
            if (n.next != null)
                queue.offer(n.next);
        }
        
        return dummy.next;
    }
}

参考资料：http://www.programcreek.com/2013/02/leetcode-merge-k-sorted-lists-java/

时间复杂度：不太清楚

看算法总结吧。。。



