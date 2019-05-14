import java.util.ArrayList;
import java.util.List;

/**
 * Created by mr.lin on 2019/5/13
 * <p>
 * Spiral Matrix
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/
 */
public class SpiralMatrixSolution {

    public static List<Integer> spiralOrder(int[][] matrix) {

        ArrayList result = new ArrayList<Integer>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        while (left <= right && top <= bottom) {

            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
            }
            right--;

            if (top <= bottom) {//同行，不能回头
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {//同列，不能回头
                for (int j = bottom; j >= top; j--) {
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List result = spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        });

        System.out.println(result.toString());
    }

}
