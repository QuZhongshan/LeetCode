public class Solution {
    public String decodeString(String s) {
        if (s == null || s.length() == 0)
            return s;
        
        Stack<Integer> countStack = new Stack<Integer>();
        Stack<String> strStack = new Stack<String>();
        String res = "";
        
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = count * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                
                countStack.push(count);
            } else if (s.charAt(idx) == '[') {
                strStack.push(res);
                res = "";
                idx++;
            } else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            } else {
                res += s.charAt(idx++);
            }
        }
        
        return res;
    }
}

参考资料：leetcode中的Solutions；

时间复杂度：不太清楚。。。

思路是了解了，就是使用两个栈来进行操作，一个栈用于存储数字，另一栈用于存储字符串，之后根据
字符‘[’和‘]’来决定出栈和入栈时间，啊啊啊，今天实在做不下去了，就先这样吧。。。。




