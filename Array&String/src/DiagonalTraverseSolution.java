/**
 * Created by mr.lin on 2019-05-13.
 * <p>
 * Diagonal Traverse
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/
 */
public class DiagonalTraverseSolution {

    public static int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[]{};
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int[] result = new int[row * col];

        int direction = 1;//右上方

        int x = 0;
        int y = 0;

        for (int i = 0; i < row * col; i++) {

            result[i] = matrix[x][y];

            x = x + direction * -1;
            y = y + direction;

            if ((x < 0 || y >= col) || (y < 0 || x >= row)) {//越界转头
                direction = direction * -1;

                if (direction == -1) {
                    x = x + 1;
                    if (y >= col) {//越界分单脚越界和双脚越界
                        x = x + 1;
                        y = y - 1;
                    }
                } else {
                    y = y + 1;
                    if (x >= row) {
                        x = x - 1;
                        y = y + 1;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] result = findDiagonalOrder(new int[][]{{1}});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
