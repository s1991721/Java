package solution;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1374/
 */
public class NumberOFIslandsSolution {

    public int numIslands(char[][] grid) {

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != '0') {
                    export(grid, i, j);
                    count++;
                }
            }

        }

        return count;
    }

    private void export(char[][] grid, int x, int y) {
        if (x < 0 || y < 0) {
            return;
        }

        if (x < grid.length && y < grid[x].length && grid[x][y] == '1') {
            grid[x][y] = '0';
        } else {
            return;
        }

        export(grid, x, y + 1);
        export(grid, x, y - 1);
        export(grid, x + 1, y);
        export(grid, x - 1, y);
    }
}
