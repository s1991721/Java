import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jef
 * @Date: 2021/10/15 15:59
 * @Description
 * https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1171/
 */
public class PascalTriangle2Solution {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }
        if (rowIndex == 1) {
            result.add(1);
            result.add(1);
            return result;
        }
        List<Integer> last = getRow(rowIndex - 1);
        for (int i = 0; i < rowIndex + 1; i++) {
            Integer item = 0;
            if (i == 0) {
                item = 1;
            } else if (i == rowIndex) {
                item = 1;
            } else {
                item = last.get(i - 1) + last.get(i);
            }
            result.add(item);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(5).toString());
    }

}
