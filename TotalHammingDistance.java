public class Solution {
    public int totalHammingDistance(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int totalCount = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            
            for (int j = 0; j < nums.length; j++)
                count += (nums[j] >> i) & 1;
            totalCount += count * (nums.length - count);
        }
        
        return totalCount;
    }
}

参考资料：http://blog.csdn.net/xiaopihaierletian/article/details/53899133

时间复杂度：O(n)

刚开始的想法是每两个都进行一次Hamming Distance的计算，即暴力解法，不出意外的超时了，
以上是参考了leetcode中的解法，是这样的，每个实数都不超过32位，那么就一位一位的来进行
海明距离的计算，最后相加就是最终的结果了。注意，如果在一位上有k个数有1，其余的数没有1，
那么这位上总的海明距离就是k * (n - k)，这是排列组合的基础知识，以后如果忘了可以自己再
推倒一下。