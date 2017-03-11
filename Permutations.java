public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for(int i = 0; i < nums.length; i++) { 
                if(tempList.contains(nums[i])) 
                    continue;
            tempList.add(nums[i]);
            backtrack(list, tempList, nums);
            tempList.remove(tempList.size() - 1);
            }
        }
    }
}

参考资料：LeetCode中的Solutions即可

时间复杂度：还不太清楚。。。

典型的回溯算法问题，暂时还是搞不太懂，啊啊啊，一定总结，两个礼拜只内。。