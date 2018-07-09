package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/9.
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/138/background/1038/
 * <p>
 * Binary Search
 */
public class BinarySearchSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        int[] nums = Util.stringToIntegerArray(strings[0]);
        int target = Integer.parseInt(strings[1]);
        return String.valueOf(search(nums, target));
    }

    private int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int start, int end, int target) {

        int mid = start + (end - start) / 2;//预防越界 start+end
        if (start >= end && target != nums[mid]) {//中断条件的重要性
            return -1;
        }

        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return search(nums, start, mid - 1, target);
        } else {
            return search(nums, mid + 1, end, target);
        }
    }

}
