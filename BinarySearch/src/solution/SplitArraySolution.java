package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/20.
 * <p>
 * Split Array Largest Sum
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/146/more-practices-ii/1042/
 */
public class SplitArraySolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        int[] nums = Util.stringToIntegerArray(strings[0]);
        int m = Integer.valueOf(strings[1]);
        return String.valueOf(splitArray(nums, m));
    }

    private int splitArray(int[] nums, int m) {

        int sum = 0;//m=1
        int max = 0;//m=nums.length

        for (int num : nums) {
            sum += num;
            max = num > max ? num : max;
        }
        return binary(nums, m, max, sum);
    }

    private int binary(int[] nums, int m, int left, int right) {

        while (left < right) {
            int mid = left + (right - left) / 2;//可能出现的子数组各项和

            if (valid(nums, m, mid)) {//此和是否符合条件
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return left;

    }

    private boolean valid(int[] nums, int m, int mid) {

        int sum = 0;
        int count = 1;

        for (int num : nums) {//逐项相加
            sum += num;
            if (sum > mid) {//符合项数和的条件
                count++;//项数+
                sum = num;
                if (count > m) {//符合项数和条件，但不符合项数条件
                    return false;
                }
            }
        }
        return true;
    }

}
