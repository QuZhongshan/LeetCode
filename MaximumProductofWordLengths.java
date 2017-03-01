public class Solution {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0)
            return 0;
        
        int len = words.length;
        int[] val = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                val[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        
        int maxProduct = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((val[i] & val[j]) == 0)
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
            }
        }
        
        return maxProduct;
    }
}

参考资料：http://blog.csdn.net/sbitswc/article/details/50505035

这道题要分两个方面来讲，第一是解题思路，第二是细节精要；

首先是总体的解题思路，很简单，常规思路，一个一个的检查，每一个string都和之后的对象进行
比较，若有符合条件的单词在进行想乘，得到乘积后再与之前的最大值进行比较，若大于最大值则更
新这个最大值；

另一个就是重点的细节精要了，这个就是用int对象的每一位来进行存储这个单词究竟包含哪些字符，
这个通过移位和或操作符来进行，注意，这里只要求记录有没有这个字符，并没有要求记录每个字符
的个数，所以用位管理中的一位来进行管理存储就好，1表示有，0表示没有，这个技术细节值得谨记；

时间复杂度：O(n^2)
