package solution;

/**
 * Created by mr.lin on 2018/7/9.
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/125/template-i/950/
 * <p>
 * Sqrt(x)
 */
public class SqrtSolution {

    public String solution(String input) {

        int x = Integer.valueOf(input);

        return String.valueOf(mySqrt(x));

    }

    private int mySqrt(int x) {
        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            }

            if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left > x / left) {
            return left - 1;
        } else {
            return left;
        }
    }

}
