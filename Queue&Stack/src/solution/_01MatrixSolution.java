package solution;

import java.util.LinkedList;
import java.util.Queue;

public class _01MatrixSolution {

    public static int[][] updateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    continue;
                } else {
                    int count = find(matrix, i, j);
                    matrix[i][j] = count;
                }
            }
        }
        return matrix;
    }

    private static int find(int[][] matrix, int r, int c) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer(r + "-" + c);

        int count = 0;

        while (!queue.isEmpty()) {

            int loop = queue.size();
            for (int i = 0; i < loop; i++) {

                String[] temp = queue.poll().split("-");
                int row = Integer.parseInt(temp[0]);
                int col = Integer.parseInt(temp[1]);

                if (matrix[row][col] == 0) {
                    return count;
                }

                if (row + 1 < matrix.length) {
                    queue.offer((row + 1) + "-" + col);
                }
                if (col + 1 < matrix[0].length) {
                    queue.offer(row + "-" + (col + 1));
                }
                if (row > 0) {
                    queue.offer((row - 1) + "-" + col);
                }
                if (col > 0) {
                    queue.offer(row + "-" + (col - 1));
                }
            }
            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] nums = updateMatrix(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        });
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
