package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/18.
 * <p>
 * Median of Two Sorted Arrays
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/146/more-practices-ii/1040/
 */
public class MedianSolution {

    public String solution(String input) {

        String[] strings = input.split("!");
        int[] nums1 = Util.stringToIntegerArray(strings[0]);
        int[] nums2 = Util.stringToIntegerArray(strings[1]);

        return Double.toString(findMedianSortedArrays(nums1, nums2));
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        while (low <= high) {
            int partitionX = low + (high - low) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        return -1;
    }

}
