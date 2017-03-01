public class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0)
            return s;
        
        // the vowels are a, e, i, o, u
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        char[] sChar = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (!vowels.contains(sChar[start])) {
                start++;
                continue;
            }
            if (!vowels.contains(sChar[end])) {
                end--;
                continue;
            }
            
            char tmp = sChar[end];
            sChar[end] = sChar[start];
            sChar[start] = tmp;
            start++;
            end--;
        }
        
        return String.valueOf(sChar);
    }
}

参考资料：http://www.programcreek.com/2015/04/leetcode-reverse-vowels-of-a-string-java/

典型的两个指针问题，只需要注意英语元音字母有“a、e、i、o、u”五个就好；

时间复杂度：O(n)
空间复杂度：O(1)