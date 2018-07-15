package solution;

/**
 * Created by mr.lin on 2018/7/15.
 * <p>
 * Valid Perfect Square
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/137/conclusion/978/
 */
public class PerfectSquareSolution {

    public String solution(String input) {

        return Boolean.toString(isPerfectSquare(Integer.valueOf(input)));
    }

    private boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == num) {//忽略越界，提高准确度
                return true;
            }
            if (mid < num / mid) {//防止越界
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left * left == num;

    }

}
