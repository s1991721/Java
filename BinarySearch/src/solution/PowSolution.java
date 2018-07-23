package solution;

/**
 * Created by mr.lin on 2018/7/15.
 * <p>
 * Pow(x, n)
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/137/conclusion/982/
 */
public class PowSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        double x = Double.valueOf(strings[0]);
        int n = Integer.valueOf(strings[1]);

        double res=pow(x, n);
        if (n < 0) {//先求正数，后求负数
            res = 1 / res;
        }
        return res+ "";
    }

    private double pow(double x, int n) {//递归
        if (n == 0) return 1;//0次方

        double half = pow(x, n / 2);//此处除以2会损失精度

        double res;
        if (n % 2 == 0) {//将损失的精度补回来
            res = half * half;
        } else {
            res = half * half * x;
        }

        return res;
    }

}
