public class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0)
            return 0;
        
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        
        // scan from left to right
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;
        }
        
        // scan from right to left
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1])
                candies[i] = candies[i + 1] + 1;
        }

        int res = 0;
        for (int num : candies)
            res += num;
        
        return res;
    }
}

参考资料：https://siddontang.gitbooks.io/leetcode-solution/content/greedy/candy.html
        http://www.programcreek.com/2014/03/leetcode-candy-java/

时间复杂度：O(n)

思路很简单，先从左到右扫描一遍，之后从右到左扫描一遍就可以了。。。这是贪心算法。。。。