package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mr.lin on 2018/5/13.
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1131/
 */
public class HappyNumberSolution {

    public String solution(String input) {
        return Boolean.toString(isHappy(Integer.parseInt(input)));
    }

    Set<Integer> set = new HashSet<Integer>();

    private boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        set.add(n);

        int sum = 0;
        while (n != 0) {
            int num=n % 10;
            sum += num * num;
            n = n / 10;
        }

        if (set.contains(sum)) {
            return false;
        }

        return isHappy(sum);
    }
}
