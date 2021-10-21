/**
 * @Author: Jef
 * @Date: 2021/10/21 14:23
 * @Description https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1173/
 */
public class RemoveDuplicatesSolution {

    public static int removeDuplicates(int[] nums) {

        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[++k] = nums[i];
            }
        }

        return k + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
    }

}
