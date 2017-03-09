public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length < 2)
            return true;
        
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max <= i && nums[i] == 0)
                return false;
            
            max = Math.max(i + nums[i], max);
            if (max >= nums.length - 1)
                return true;
        }
        
        return false;
    }
}

参考资料：http://www.programcreek.com/2014/03/leetcode-jump-game-java/

时间复杂度：O(n)

典型的贪心算法问题，每一步计算可以到达的最大位置，若最大位置大于等于数组的长度，那么表示
可以达到，返回true；否则，更新能到达的最大位置的值，若最大位置达不到当前的位置，或者说
最大位置刚好到达当前的位置，但是当前位置的值为0，那么就说明到达不了最大位置，返回false即可。