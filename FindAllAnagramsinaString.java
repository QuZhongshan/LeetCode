public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] chars = new int[26];
        List<Integer> result = new ArrayList<>();

        if (s == null || p == null || s.length() < p.length())
            return result;
        for (char c : p.toCharArray())
            chars[c - 'a']++;

        int start = 0, end = 0, count = p.length();
        while (end < s.length()) {
            if (end - start == p.length() && chars[s.charAt(start++) - 'a']++ >= 0)
                count++;
            
            if (--chars[s.charAt(end++) - 'a'] >= 0)
                count--;
            
            if (count == 0)
                result.add(start);
        }
    
        return result;
    }
}

参考资料：http://www.thinksaas.cn/topics/0/680/680230.html

重点参考leetcode中的TopSolutions的答案，这里选了个比较好的简洁的答案，今天实在不想看了，
以后总结的时候在重点看看吧，看的七七八八的，不是特别懂。。。。。