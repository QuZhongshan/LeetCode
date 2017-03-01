public class Solution {
    public List<String> readBinaryWatch(int num) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == num)
                    result.add(String.format("%d:%02d", i, j));
            }
        }
        
        return result;
    }
}

参考资料：http://blog.csdn.net/styshoo/article/details/52908424
        重点是leetcode中的Solutions

时间复杂度：O(n^2)?应该不是吧。。不太清楚了

这道题目有两种解法，第一是迭代遍历；第二种是回溯法。这里选用了第一种，因为简单易懂；

思路是这样的，把所有可能的时间全部试一遍，如果小时的二进制形式中1的个数与分钟的二进制
形式中1的个数的数量之和正好是num，那么这个时间符合要求，加入List对象就好，是不是很
简单。