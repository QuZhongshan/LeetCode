public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";
        
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strNums[i] = String.valueOf(nums[i]);
        
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        };
        
        Arrays.sort(strNums, comp);
        if (strNums[0].charAt(0) == '0')
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String s : strNums)
            sb.append(s);
        
        return sb.toString();
    }
}

参考资料：http://www.programcreek.com/2014/02/leetcode-largest-number-java/
Comparator资料：http://www.cnblogs.com/skywang12345/p/3324788.html

怎么说呢，解答这道题目的关键是了解Comparator接口，之后构造一个比较器，比较两个字符串
组合的大小，思路还是比较简单，要注意参考leetcode中的TopSolutions中的解答。还要注意
一点，如果排序之后的字符串数组的第一个字符串对象的第一个字符是‘0’，说明这个数组中所有
的字符串对象都是“0”，之后就没什么了。