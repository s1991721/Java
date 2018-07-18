package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/17.
 * <p>
 * Find the Duplicate Number
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/146/more-practices-ii/1039
 */
public class DuplicateNumberSolution {

    public String solution(String input) {
        int[] nums = Util.stringToIntegerArray(input);
        return String.valueOf(findDuplicate(nums));
    }

    private int findDuplicate(int[] nums) {
        int left = 1;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (mid < count) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

//    private int findDuplicate(int[] nums) {
//        int slow = nums[0];
//        int fast = nums[nums[0]];
//        while (slow != fast) {
//            slow = nums[slow];
//            fast = nums[nums[fast]];
//        }
//
//        fast = 0;
//        while (fast != slow) {
//            fast = nums[fast];
//            slow = nums[slow];
//        }
//        return slow;
//    }
}
