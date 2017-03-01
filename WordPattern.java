public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;
        
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i]))
                    return false;
            } else {
                if (map.containsValue(words[i]))
                    return false;
                map.put(c, words[i]);
            }
        }
        
        return true;
    }
}

参考资料：https://segmentfault.com/a/1190000003827151

注意参考leetcode的TopSolutions里的答案，很好的。思路还是比较清晰，就是使用一个map结构用来
存储映射关系，同时注意映射关系必须是一对一的，这是一定的，所以不仅要注意map中的key值是不能重复，
value值也不能重复，自己做的时候就是在这个地方比较混乱。好了，还好，最起码思路对了。