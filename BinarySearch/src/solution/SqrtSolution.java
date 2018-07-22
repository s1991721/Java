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
            int mid = left + (right - left) / 2;//防止越界
            if (mid == x / mid) {
                return mid;
            }

            if (mid < x / mid) {//如果mid足够大，mid * mid则会越界，所以通过x / mid来防止越界
                left = mid + 1;//1的特例已经过了，所以左脚要迈进而不是踩点
            } else {
                right = mid - 1;
            }
        }

        if (left > x / left) {//当x不能完全开平方时，取整数位
            return left - 1;
        } else {
            return left;
        }
    }

}
