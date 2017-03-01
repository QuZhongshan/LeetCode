public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5) == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        
        return result;
    }
}

参考资料：leetcode中的Solutions

时间复杂度：O(n)

没什么想说的，感觉侮辱智商。。。。