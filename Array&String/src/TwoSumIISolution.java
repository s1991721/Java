/**
 * Created by mr.lin on 2019/5/17
 * <p>
 * Two Sum II - Input array is sorted
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1153/
 */
public class TwoSumIISolution {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {//无等号，数组内无重复
            int sum = numbers[left] + numbers[right];

            if (target == sum) {
                return new int[]{left + 1, right + 1};
            } else if (target < sum) {
                right--;
            } else {
                left++;
            }

        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9));
    }

}
