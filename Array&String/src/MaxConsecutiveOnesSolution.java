/**
 * Created by mr.lin on 2019/5/17
 * <p>
 * Max Consecutive Ones
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1301/
 */
public class MaxConsecutiveOnesSolution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        return count > max ? count : max;

    }

}
