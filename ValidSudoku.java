public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9)
            return false;
        
        // judge rows
        for (int i = 0; i < 9; i++) {
            int[] digit = new int[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    digit[board[i][j] - '0']++;
                    if (digit[board[i][j] - '0'] > 1)
                        return false;
                }
            }
        }
        
        // judge columns
        for (int i = 0; i < 9; i++) {
            int[] digit = new int[10];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    digit[board[j][i] - '0']++;
                    if (digit[board[j][i] - '0'] > 1)
                        return false;
                }
            }
        }
        
        // judge cubes
        for (int cube = 0; cube < 9; cube++) {
            int[] digit = new int[10];
            for (int i = cube / 3 * 3; i < cube / 3 * 3 + 3; i++) {
                for (int j = cube % 3 * 3; j < cube % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        digit[board[i][j] - '0']++;
                        if (digit[board[i][j] - '0'] > 1)
                            return false;
                    }
                }
            }
        }
        
        return true;
    }
}

参考资料：http://blog.csdn.net/linhuanmars/article/details/20748171

时间复杂度：O(3 * n ^ 2)，其中n = 9

首先要明白数独就是九宫格而已，还要了解数独的规则。以上采用的是暴力解法，首先判断行，再
判断列，最后判断方阵就行了。判断方阵的时候要注意行和列是怎么取值的。