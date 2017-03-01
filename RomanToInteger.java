public class Solution {
    public int romanToInt(String s) {
        char[] symbol = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] val = {1, 5, 10, 50, 100, 500, 1000};
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < symbol.length; i++)
            map.put(symbol[i], val[i]);
        
        int res = 0;
        res += map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int cur = map.get(s.charAt(i));
            int pre = map.get(s.charAt(i - 1));
            
            if (cur <= pre)
                res += cur;
            else
                res = res + cur - 2 * pre;
        }
        
        return res;
    }
}

参考资料：https://my.oschina.net/jdflyfly/blog/283587
        http://www.cnblogs.com/springfor/p/3886459.html