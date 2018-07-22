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
            int mid = left + (right - left) / 2;//排序数组的中间位置
            int realPosition = (mid + pivot) % len;//偏移后中间位置，在未排序数组中的实际位置
            if (target == nums[realPosition]) return realPosition;
            if (target > nums[realPosition]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;

    }

    //左侧未排序的数组各项都大于右侧未排序数组项
    private int getPivot(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {//mid在右侧数组
                right = mid;
            } else {//mid在左侧数组
                left = mid + 1;
            }

        }
        return left;
    }

}