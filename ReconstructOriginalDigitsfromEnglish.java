public class Solution {
    public String originalDigits(String s) {
        if (s == null || s.length() == 0)
            return "";
        
        int[] count = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'z') count[0]++;
            if (c == 'w') count[2]++;
            if (c == 'u') count[4]++;
            if (c == 'x') count[6]++;
            if (c == 'g') count[8]++;
            if (c == 'o') count[1]++;
            if (c == 'h') count[3]++;
            if (c == 'f') count[5]++;
            if (c == 's') count[7]++;
            if (c == 'i') count[9]++;
        }
        
        count[7] -= count[6];
        count[5] -= count[4];
        count[3] -= count[8];
        count[9] = count[9] - count[8] - count[5] - count[6];
        count[1] = count[1] - count[0] - count[2] - count[4];
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < count[i]; j++)
                sb.append(i);
        }
        
        return sb.toString();
    }
}

参考资料：leetcode中的Solutions自己看

时间复杂度：O(n)

这道题要点在于找规律，含金量低，自己看看答案明白了就行了。。。



