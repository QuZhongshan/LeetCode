public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        if (carry == 1)
            sb.append('1');
        
        return sb.reverse().toString();
    }
}

参考资料：无，直接借鉴leetcode中的Top Solutinos即可；

怎么说呢，常规题目，以前似乎做过，注意一点，绝对不能转换为int数值在进行计算，因为这样
很繁琐，需要处理越界情况等等。至于思路很清楚，逐位相加，注意进位就好，啊啊啊！