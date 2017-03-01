public class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        if (area == 0)
            return res;
        
        int w = (int)Math.sqrt(area);
        while (area % w != 0)
            w--;
        
        int l = area / w;
        res[0] = l;
        res[1] = w;
        
        return res;
    }
}

参考资料：leetcode中的Solutions

时间复杂度：不太清楚。。。

思路很简单，最好的结果是面积开平方，如果成功，说明差别为0，符合要求，否则的话一次减一，
逐一去试，知道找到想乘正好等于面积的两个数为止。。

今天很懒，都是挑的简单题型，似乎我每天都很懒。。