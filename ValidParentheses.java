public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0 || s.length() % 2 == 1)
            return false;
        
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' ||
                s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0)
                    return false;
                
                char top = stack.peek();
                if (top == '(' && s.charAt(i) == ')')
                    stack.pop();
                else if (top == '[' && s.charAt(i) == ']')
                    stack.pop();
                else if (top == '{' && s.charAt(i) == '}')
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }
        
        return stack.empty();
    }
}

参考资料：http://www.cnblogs.com/springfor/p/3869420.html
        http://www.programcreek.com/2012/12/leetcode-valid-parentheses-java/