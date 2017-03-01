public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) 
            return false;
        
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        
        return false;
    }
}

参考资料：http://blog.csdn.net/DERRANTCM/article/details/48046275

这道题很简单，解法有很多，这里总结两种，第一种就是上面的解答，也是我自己最先想到的答案，首先
对这个数组进行排序，之后遍历数组，看是否存在两个相等的相邻元素，若存在则说明存在重复元素，否则
就是不存在。
第二种就是使用Set数据结构，根据set结构的特点，set数据结构中的元素都不想等来进行判断，具体可以
参考以上的参考资料，很清楚，哈哈！

总之今天很懒，不想做题Orz，求解救。。。。