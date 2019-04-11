package solution;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/232/practical-application-stack/1389/
 */
public class TargetSumSolution {

    int result = 0;

    public int findTargetSumWays(int[] nums, int S) {
        helper(nums, 0, S);
        return result;
    }

    private void helper(int[] nums, int position, int S) {
        if (position >= nums.length) {
            if (S == 0) {
                result++;
            }
            return;
        }

        helper(nums, position + 1, S - nums[position]);
        helper(nums, position + 1, S + nums[position]);
    }

}
