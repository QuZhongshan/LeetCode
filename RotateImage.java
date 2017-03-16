public class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}

参考资料：LeetCode中的Solutions
        http://blog.csdn.net/martinmateng/article/details/50727243

时间复杂度：不太清楚。。。

第一次接触矩阵的问题，说是没怎么仔细看，知道是纯数学的问题所以就直接找了答案copy了一下，
以后再看，实在不懂可以画个图模拟一下啊。。