/**
 * Created by mr.lin on 2019-04-29.
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
 */
public class PivotIndexSolution {

    public static int pivotIndex(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        int sumL = nums[left];
        int sumR = nums[right];
        while (left < right) {
            if (sumL == sumR && left + 1 == right - 1) {
                return left + 1;
            } else if (sumL < sumR) {
                left++;
                sumL += nums[left];
            } else {
                right--;
                sumR += nums[right];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -1, -1, 0};
        System.out.println(pivotIndex(nums) + "");
    }

}
