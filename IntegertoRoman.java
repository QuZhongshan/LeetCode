public class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        
        return sb.toString();
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3886459.html
        leetcode中的Solutions

时间复杂度：不太清楚。。

这道题目很麻烦，因为罗马数字的规则就很麻烦，解法也有很多，这里选择了一种容易理解的解法，
其他解法可以参考资料，没什么可说的了。。。