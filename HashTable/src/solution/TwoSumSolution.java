package solution;

import java.util.HashMap;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/18.
 * <p>
 * Two Sum
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1115/
 */
public class TwoSumSolution {

    public String solution(String input) {
        int[] nums = Util.stringToIntegerArray(input.split("!")[0]);
        int target = Integer.parseInt(input.split("!")[1]);

        return Util.integerArrayToString(twoSum(nums, target));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int tem = target - nums[i];
            if (map.containsKey(tem) && map.get(tem) != i) {
                return new int[]{i, map.get(tem)};
            }
        }
        return new int[]{};
    }

}
