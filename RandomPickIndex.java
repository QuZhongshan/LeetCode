public class Solution {
    private int[] nums;
    private Random random;
    
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    public int pick(int target) {
        int result = -1;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target)
                continue;
            if (random.nextInt(++count) == 0)
                result = i;
        }
        
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */

参考资料：http://blog.csdn.net/mebiuw/article/details/52511992

时间复杂度：O(n)

首先说明一下，我自己的算法也是AC的，而且和所给的算法大同小异，只是具体细节不太一样，它
处理的更漂亮，而且更加省时；

首先说说我的算法，第一步，遍历整个数组，统计target出现的次数；第二步，在总次数中随机
产生一个数，即我们就要返回的结果，就是target第几次出现的下标。这样做总共遍历了两次数组
，时间复杂度依然是O(n)；

之后说说参考的做法，这种做法只需要遍历一次数组，它最漂亮的地方在于产生随机数的地方，就是
random.nextInt(++count) == 0这一句，这句现在我也不知道什么意思。。。。不过看别人
的博客说这是leetcode种处理字符串的常用做法，暂时先这么记吧，之后在遇到了可能会有解答，到时候
就知道了。。。。总之代码不难理解啦。

