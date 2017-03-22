public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        
        return res;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

参考资料：LeetCode中的Solutions
        http://www.programcreek.com/2013/01/leetcode-subsets-java/

时间复杂度：不太清楚

这道题目是典型的回溯算法类型的题目；说实话暂时还不太理解，先摆在这里以后看看。。。。
千万不要把负面情绪传染给其他人，一定要注意！！