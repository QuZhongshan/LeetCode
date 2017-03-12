public class Solution {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0)
            return b;
        if (b == null || b.length() == 0)
            return a;
        
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            res.append(sum % 2);
            carry = sum / 2;
        }
        
        if (carry == 1)
            res.append(1);
        
        return res.reverse().toString();
    }
}

参考资料：直接看LeetCode中的Solutions就好

时间复杂度：O(n)

解题思路非常简单，没有什么好说的，不过有几点需要注意。
第一，注意从后往前计算，这样才符合计算的规律，从前往后计算就错了；
第二，注意代码的简洁性，上面的答案就非常简洁，这种习惯要好好培养；