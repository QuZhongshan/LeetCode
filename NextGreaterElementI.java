public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        
        for (int i = 0; i < findNums.length; i++)
            res[i] = map.getOrDefault(findNums[i], -1);
        
        return res;
    }
}

参考资料：leetcode中的Solutions

时间复杂度：O(n)是么。。。？

首先我刚开始想的思路是只用map来解决，遍历一遍数组nums，将每个元素和它所对应的下一个比他大的
数组中的值直接放入map中即可，之后直接从map查找即可，也ac,而且看结果效率应该比以上的所推荐
的算法还好；

以上的算法主要思想是使用stack的数据结构来进行计算，对于数组中的每一个元素，若之前有比他
小的元素，则将这些元素全部出栈，之后将该元素入栈即可，真难想啊。。怎么可能想得到，只能纯
靠经验，多积累。。。