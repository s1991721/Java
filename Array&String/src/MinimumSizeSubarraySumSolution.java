/**
 * Created by mr.lin on 2019/5/17
 * <p>
 * Minimum Size Subarray Sum
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1299/
 */
public class MinimumSizeSubarraySumSolution {

    public static int minSubArrayLen(int s, int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int sum = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum >= s) {
                if (min > (i - start)) {
                    min = i - start + 1;
                }
                sum = sum - nums[start++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;

    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

}
