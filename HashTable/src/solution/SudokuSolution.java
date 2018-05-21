package solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/20.
 * <p>
 * Valid Sudoku
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/185/hash_table_design_the_key/1126/
 */
public class SudokuSolution {

    public String solution(String input) {
        return Boolean.toString(isValidSudoku(Util.stringToCharChar(input)));
    }

    private boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Integer>> row = new HashMap<Integer, Set<Integer>>();
        HashMap<Integer, Set<Integer>> colum = new HashMap<Integer, Set<Integer>>();
        HashMap<Integer, Set<Integer>> box = new HashMap<Integer, Set<Integer>>();
        for (int i = 0; i < 9; i++) {
            if (row.get(i) == null) row.put(i, new HashSet<Integer>());
            for (int j = 0; j < 9; j++) {
                if (colum.get(j) == null) colum.put(j, new HashSet<Integer>());
                if (box.get((i / 3) + (j / 3) * 3) == null)
                    box.put((i / 3) + (j / 3) * 3, new HashSet<Integer>());
                if (board[i][j] == '.') {
                    continue;
                }
                if (!row.get(i).add(board[i][j] - '0')) return false;
                if (!colum.get(j).add(board[i][j] - '0')) return false;
                if (!box.get((i / 3) + (j / 3) * 3).add(board[i][j] - '0')) return false;
            }
        }
        return true;
    }
}
