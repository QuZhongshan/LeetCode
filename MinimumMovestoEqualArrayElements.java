public class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for (int num : nums)
            min = Math.min(min, num);
        
        int res = 0;
        for (int num : nums)
            res += num - min;
        
        return res;
    }
}

参考资料：http://www.cnblogs.com/grandyang/p/6053827.html
同时参考leetcode中的TopSolutions。

这是一道纯粹的数学题，真的。至于思路参考资料里面写的很清楚，我也就不多说了，看看吧。
同学，学好数学很重要。