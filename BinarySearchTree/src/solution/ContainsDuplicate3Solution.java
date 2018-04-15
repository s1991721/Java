package solution;

import java.util.TreeSet;

import utils.Utils;

/**
 * Created by mr.lin on 2018/4/15.
 * <p>
 * Contains Duplicate III
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/142/conclusion/1013/
 */
public class ContainsDuplicate3Solution {

    public String solution(String input) {
        String[] strings = input.split("!");

        int[] nums = Utils.stringToIntegerArray(strings[0]);
        int k = Integer.parseInt(strings[1]);
        int t = Integer.parseInt(strings[2]);

        return Boolean.toString(containsNearbyAlmostDuplicate(nums, k, t));
    }

    private boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        if (k <= 0 || t < 0) {
            return false;
        }

        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if ((set.floor(num) != null && num - set.floor(num) <= t)
                    || set.ceiling(num) != null && set.ceiling(num) - num <= t) {
                return true;
            } else {
                set.add(num);
            }

            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}
