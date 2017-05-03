解法一：暴力解法
public class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0)
            return 0;
        
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                if (heights[j] < minHeight)
                    minHeight = heights[j];
            
                maxArea = Math.max(maxArea, (j - i + 1) * minHeight);
            }
        }
        
        return maxArea;
    }
}

时间复杂度：O(n^2)

此解法为暴力解法，其基本思想是遍历所有的从 i 到 j 的矩形，每次找到 从 i 到 j 的最小高度，
之后求解矩形面积，遍历所有的矩形即可。比较容易理解，按理说这道题目应该使用动态规划DP来解，
但实在想不出怎么用DP做，这里的两种解法应该都不是DP吧。。

解法二：用栈来做
public class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0)
            return 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int maxArea = 0;
        int index = 0;
        while (index < heights.length) {
            if (stack.isEmpty() || heights[index] > heights[stack.peek()]) {
                stack.push(index);
                index++;
            } else {
                int preIndex = stack.pop();
                int h = heights[preIndex];
                int w = stack.isEmpty() ? index : index - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
        }
        
        while (!stack.isEmpty()) {
            int preIndex = stack.pop();
            int h = heights[preIndex];
            int w = stack.isEmpty() ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }
        
        return maxArea;
    }
}

时间复杂度：O(n)

这种解法使用一个栈来简化求解过程，具体解析就看参考资料吧，我自己还说不清

参考资料：http://www.cnblogs.com/lichen782/p/leetcode_Largest_Rectangle_in_Histogram.html
		http://www.programcreek.com/2014/05/leetcode-largest-rectangle-in-histogram-java/





