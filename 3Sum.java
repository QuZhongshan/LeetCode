public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return res;
        
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            
            int j = i + 1, k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        
        return res;
    }
}

参考资料：http://blog.csdn.net/ljiabin/article/details/40620579
        leetcode中的Solutions

时间复杂度：O(n^2)

这是Ksum问题中的一种，因为ksum问题暂时还没有总结，所以不要想那么多，直接解答这个问题
就好；

首先想到的是暴力解法，使用三层for循环来解决问题，时间复杂度为O(n^3)，时间复杂度太高，
pass掉，接下来想想如何解决时间复杂度；最后的解决思路是首先进行排序，时间复杂度为O(nlogn)，
之后固定住一个元素，使用两个指针的解法在之后的数组元素中找到和该元素想加为0的两个元素，这
就转换为了2Sum问题，时间复杂度就减少为了O(n^2)。这种写法，可以避免结果集中有重复，因为
数组时排好序的，所以当一个数被放到结果集中的时候，其后面和它相等的直接被跳过。





