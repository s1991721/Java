/**
 * Created by mr.lin on 2019-04-29.
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
 */
public class PivotIndexSolution {

    public static int pivotIndex(int[] nums) {

        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (totalSum - nums[i] == 2 * curSum) {
                return i;
            }else {
                curSum+=nums[i];
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -1, -1, 0};
        System.out.println(pivotIndex(nums) + "");
    }

}
