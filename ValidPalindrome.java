public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if (!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
}

这道题目的思路很简单，设置头尾指针，依次进行判断，对整个字符串循环遍历一次就好，还不错，Leetcode
Top Solutions上的答案挺好的，和我的风格很像，所以就照搬了，临时也是有点事情，所以没有自己写，
不过思路挺清楚的，就这样吧，哈哈哈哈