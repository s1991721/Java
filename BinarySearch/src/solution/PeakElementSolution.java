package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/10.
 * <p>
 * Find Peak Element
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/126/template-ii/948
 */
public class PeakElementSolution {

    public String solution(String input) {
        int[] nums = Util.stringToIntegerArray(input);
        return findPeakElement(nums) + "";
    }

    private int findPeakElement(int[] nums) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (left == right)
                return left;
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1])//自己小于右的话，peak在右边,左脚迈进
                left = mid + 1;
            else//自己大于右边，peak可能是自己也可能在左边，右脚踩点
                right = mid;

        }
        return -1;
    }

}
