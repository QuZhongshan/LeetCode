/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        if (head == null)
            return null;
        
        ListNode pre = head, cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        
        return head;
    }
}

参考资料：http://blog.csdn.net/xudli/article/details/45267185

其实也没啥好说的，就两个指针，遍历一遍链表，一样的就删。需要注意的是，开始的时候要找到一个头结点
的值不等于所给定的值，仅此而已，我认为我写的比网上写的代码更通俗易懂，思路简洁点，所以就没有借鉴
网上的代码，需要看其他非常规方法的话可以看看leetcode上的topsolution，不过估计你不会看了啊哈哈！
月，你现在怎么样，好像知道，可是。。。我该怎么办怎么办怎么办啊啊啊啊