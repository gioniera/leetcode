package lcci;

/**
 * @author: WYL
 * @create: 2020-03-04 19:18
 * 面试题 01.07. 旋转矩阵
 **/
public class P0107 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //沿中线翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
        //沿对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = tmp;
            }
        }

    }
}
