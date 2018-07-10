package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/9.
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/125/template-i/952
 * <p>
 * Search in Rotated Sorted Array
 */
public class RotatedSortedArraySolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        int[] nums = Util.stringToIntegerArray(strings[0]);
        int target = Integer.valueOf(strings[1]);

        return search(nums, target) + "";
    }

    private int search(int[] nums, int target) {

        int pivot = getPivot(nums);//获取轴心位置
        int len = nums.length;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int realmid = (mid + pivot) % len;//偏移
            if (target == nums[realmid]) return realmid;
            if (target > nums[realmid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;

    }

    private int getPivot(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

}