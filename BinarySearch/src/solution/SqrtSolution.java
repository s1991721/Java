package solution;

/**
 * Created by mr.lin on 2018/7/9.
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
            mid = (left + right) / 2;
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
