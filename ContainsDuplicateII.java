public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2)
            return false;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int pre = map.get(nums[i]);
                if (i - pre <= k)
                    return true;
            }
            
            map.put(nums[i], i);
        }
        
        return false;
    }
}

参考资料：http://www.programcreek.com/2014/05/leetcode-contains-duplicate-ii-java/

思路很简单，我刚开始想的是比较常规的想法，也就是最容易想到的解法，从前往后遍历一遍，每到一个数，
查看之后有没有和它相同的元素，如果有在比较他们之间下标的差值，时间复杂度O（n2），效率极低；

网上参考的算法利用map这种数据结构，思路的话看参考资料吧，懒得写了。。。。时间复杂度O（n）。