public class Solution {
    public boolean canWinNim(int n) {
        
        return n % 4 != 0;
    }
}

参考资料：http://bookshadow.com/weblog/2015/10/12/leetcode-nim-game/

这道题是纯粹的算法问题，总之只有一条原则，只要石头数量是4的倍数，那么先手一定输，具体
可见参考资料，若数量不是4的倍数，那么先手可以拿取1至3块石头使之减到4的倍数，这样先手
是一定赢得。

时间复杂度：O(1)
