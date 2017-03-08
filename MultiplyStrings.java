public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] product = new int[len1 + len2];
        
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + product[p2];
                
                product[p1] += sum / 10;
                product[p2] = sum % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int p : product)
            if (!(sb.length() == 0 && p == 0))
                sb.append(p);
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3889706.html
        leetcode中的Solutions

时间复杂度：不太清楚

纯粹的数学问题，模拟乘法的计算过程，这里涉及到一个乘法中的普遍规律，所以对数学知识一定要
有深刻的理解，思路参考资料里面很清楚，我就不啰嗦了
