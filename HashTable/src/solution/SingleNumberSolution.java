package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/13.
 * <p>
 * Single Number
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1176/
 */
public class SingleNumberSolution {

    public String solution(String input) {
        return String.valueOf(singleNumber(Util.stringToIntegerArray(input)));
    }


    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
