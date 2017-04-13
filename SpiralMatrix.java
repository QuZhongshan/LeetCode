public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        
        int min = Math.min(matrix.length, matrix[0].length);  
        int levelNum = min / 2;  
        for (int level = 0; level < levelNum; level++) {  
            for (int i = level; i < matrix[0].length - level - 1; i++)
                res.add(matrix[level][i]);

            for (int i = level; i < matrix.length - level - 1; i++)
                res.add(matrix[i][matrix[0].length - 1 - level]);

            for (int i = matrix[0].length - 1 - level; i > level; i--)
                res.add(matrix[matrix.length - 1 - level][i]);
        
            for (int i = matrix.length - 1 - level; i > level; i--)
                res.add(matrix[i][level]);
        }
    
        if (min % 2 == 1) {
            if (matrix.length < matrix[0].length) {  
                for (int i = levelNum; i < matrix[0].length - levelNum; i++)
                    res.add(matrix[levelNum][i]);  
            } else {
                for (int i = levelNum; i < matrix.length - levelNum; i++)
                    res.add(matrix[i][levelNum]);
            }
        }
        
        return res;  
    }
}

参考资料：http://blog.csdn.net/linhuanmars/article/details/21667181

时间复杂度：O(m * n)

其实思路很简单，就是按照右下左上的顺序依次访问矩阵中的值，具体的可以参考对于矩阵问题的总结，
这里就不在详述了。





