package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/16.
 * <p>
 * Two Sum II - Input array is sorted
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/144/more-practices/1035/
 */
public class TwoSumSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        int[] nums = Util.stringToIntegerArray(strings[0]);
        int target = Integer.valueOf(strings[1]);
        return Util.integerArrayToString(twoSum(nums, target));
    }

    private int[] twoSum(int[] numbers, int target) {
        int index1, index2;
        for (int i = 0; i < numbers.length - 1; i++) {
            int temp = search(numbers, i + 1, numbers.length - 1, target - numbers[i]);
            if (temp != -1) {
                index1 = i + 1;
                index2 = temp + 1;
                return new int[]{index1, index2};
            }
        }
        return new int[]{-1, -1};
    }

    private int search(int[] nums, int left, int right, int target) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }
}
