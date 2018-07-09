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

        int target = Integer.valueOf(input);

        if (target == 0) {
            return "0";
        }

        int left = 0;
        int right = Integer.MAX_VALUE;

        int mid = 0;
        while (left < right) {
            mid =left+ (right - left) / 2;//预防越界 （start+end）／2
            if (target / mid == mid) {//mid * mid超范围
                return mid + "";
            } else if (target / mid > mid) {
                if (left == mid) {
                    return mid + "";
                }
                left = mid;
            } else {
                if (right == mid) {
                    return mid + "";
                }
                right = mid;
            }
        }

        return mid + "";
    }

}
