public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int total = 0;
        int start = 0;
        
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
            
            total += gas[i] - cost[i];
        }
        
        if (total < 0)
            return -1;
        else
            return start;
    }
}

参考资料：https://siddontang.gitbooks.io/leetcode-solution/content/greedy/gas_station.html
        http://www.programcreek.com/2014/03/leetcode-gas-station-java/

时间复杂度：O(n)

贪心算法的题目，但我看不出哪里用到了贪心策略，算了，能做出来就行，具体思路看参考资料