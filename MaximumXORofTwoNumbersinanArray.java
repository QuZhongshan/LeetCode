public class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for(int i = 31; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            
            int tmp = max | (1 << i);
            for(int prefix : set){
                if(set.contains(tmp ^ prefix)) {
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}

参考资料：https://segmentfault.com/a/1190000007283296

时间复杂度：O(n)

这道题我是一头雾水的啊啊啊啊，实在有点懵，今天不想做啊啊啊啊，以后要看！！！！！！！！