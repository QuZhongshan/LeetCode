public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0)
            return null;
        
        // 初始将进位设为1很重要！！
        int carry = 1;
        for (int i = digits.length - 1; i>=0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            
            if (carry == 0)
                break;
        }
        
        if (carry == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        } else
            return digits;
    }
}

参考资料：http://www.itnose.net/news/172/6334216

参考资料里的思路与我自己所想到的思路是一样的，还不错，不过运行效率很低，试了一下leetcode上的
TopSolutions的推荐解法，可以理解，也很简练，具体如下：

public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}

都记一下吧，哈哈哈哈哈哈

