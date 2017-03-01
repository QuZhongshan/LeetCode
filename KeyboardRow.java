public class Solution {
    public String[] findWords(String[] words) {
        if (words == null || words.length == 0)
            return words;
        
        String[] strs = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray())
                map.put(c, i);
        }
        
        ArrayList<String> list = new ArrayList<String>();
        for (String realWord : words) {
            String str = realWord.toLowerCase();
            int index = map.get(str.charAt(0));
            
            for (int i = 1; i < str.length(); i++) {
                if (map.get(str.charAt(i)) != index) {
                    index = -1;
                    break;
                }
            }
            
            if (index != -1)
                list.add(realWord);
        }
        
        return list.toArray(new String[0]);
    }
}

参考资料：leetcode中的Solutions

时间复杂度：不太清楚。。。。

思路很简单，我自己做的也AC了，不过就是代码不太优雅；
首先是将所有的键盘上的字符与行号存入到一个map数据结构中去，之后对每一个字符串进行检查
查看它的每一个字符是否是在同一行中存在，若符合要求就把这个字符串存入到list中去，最后
将list转换为String数组返回即可，总体来说很简单，需要注意的就是list如何转换成对象数组。。。




