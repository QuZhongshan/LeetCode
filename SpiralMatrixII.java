public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n <= 0)
            return res;

        int levelNum = n / 2;
        int number = 1;
        for (int l = 0; l < levelNum; l++) {
            for (int i = l; i < n - l; i++)
                res[l][i] = number++;  
        
            for (int i = l + 1; i < n - l; i++)  
                res[i][n - 1 - l] = number++;  
 
            for (int i = n - 2 - l; i >= l; i--)
                res[n-1-l][i] = number++;

            for (int i = n - 2 - l; i > l; i--)
                res[i][l] = number++;
        }

        if (n % 2 == 1)
            res[levelNum][levelNum] = number; 

        return res;
    }
}

参考资料：http://blog.csdn.net/linhuanmars/article/details/21906331

时间复杂度：O(n^2)

看算法里面矩阵的相关总结，这里不再详述了。





