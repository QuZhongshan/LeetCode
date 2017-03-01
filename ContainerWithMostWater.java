public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
	    int maxArea = 0;

	    while (left < right) {
		    maxArea = Math.max(maxArea, Math.min(height[left], height[right])
				            * (right - left));
		    if (height[left] < height[right])
			    left++;
		    else
			    right--;
	    }

	    return maxArea;
    }
}

参考资料：http://blog.csdn.net/a83610312/article/details/8548519
		https://segmentfault.com/a/1190000003815582
		leetcode中Solutions

时间复杂度：O(n)

首先需要理解题意，数组height中每个元素都代表的是该坐标出所对应的高度，题意为找出两条
竖线，和x轴一起组成一个矩形，求这个矩形的最大面积，求面积方式就是这他们的x小标之差乘以
这两个高度中的最小值即可；

理解了题意之后开始对这道题进行分析，第一想法可以用暴力解法，事实上我刚开始也是这么做的，
结果是超时了，接着想如何能够提高效率，减少时间复杂度；参考答案中所给出的是首尾指针法，
最大盛水量取决于两边中较短的那条边，而且如果将较短的边换为更短边的话，盛水量只会变少。
所以我们可以用两个头尾指针，计算出当前最大的盛水量后，将较短的边向中间移，因为我们想
看看能不能把较短的边换长一点。这样一直计算到左边大于右边为止就行了。

这是比较经典的一道题目，一定要理解掌握。