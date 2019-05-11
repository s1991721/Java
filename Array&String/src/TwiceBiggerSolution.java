/**
 * Created by mr.lin on 2019-05-11.
 * <p>
 * Largest Number At Least Twice of Others
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/
 */
public class TwiceBiggerSolution {

    public static int dominantIndex(int[] nums) {

        int max = -1, maxEd = -1, index = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                maxEd = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > maxEd) {
                maxEd = nums[i];
            }

        }

        return max - maxEd * 2 >= 0 ? index : -1;
    }

    public static void main(String[] args) {
        dominantIndex(new int[]{0,0,1,2});
    }

}
