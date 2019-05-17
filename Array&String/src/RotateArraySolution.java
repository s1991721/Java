/**
 * Created by mr.lin on 2019/5/17
 * <p>
 * Rotate Array
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1182/
 */
public class RotateArraySolution {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);    //7654321
        reverse(nums, 0, k - 1);        //5674321
        reverse(nums, k, nums.length - 1);//5671234

    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}
