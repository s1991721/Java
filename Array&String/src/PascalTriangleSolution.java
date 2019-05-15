import java.util.ArrayList;
import java.util.List;

/**
 * Created by mr.lin on 2019/5/15
 * <p>
 * Pascal's Triangle
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/
 */
public class PascalTriangleSolution {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(j, 1);
                } else {
                    int sum = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(j, sum);
                }
            }

            result.add(i, row);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5).toString());
    }

}
