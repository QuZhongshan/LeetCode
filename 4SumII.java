public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length;
        int res = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = -(C[i] + D[j]);
                
                if (map.containsKey(sum)) {
                    res += map.get(sum);
                }
            }
        }
        
        return res;
    }
}

参考资料：leetcode中的Solutions

时间复杂度：O(n^2)

这道题解法思路很巧妙却也很简单，那就是将这个问题拆解为两个2Sum问题，解答起来就非常简单了，
不多说了，直接看解答就能明白。。。