public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0)
            return 0;
        
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res << 1;
            if ((n & 1) == 1)
                res++;
            n = n >>> 1;
        }
        
        return res;
    }
}

参考资料：LeetCode中的Solutions

时间复杂度：应该是O(1)，如果没有错误的话，不太确定

其实思路很简单，首先将res设置为0，对n进行逐位判断。若为1，则res先左移一位，同时加一；
若为0，res直接左移一位就好。